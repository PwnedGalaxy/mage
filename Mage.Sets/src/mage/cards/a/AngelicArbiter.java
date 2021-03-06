/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 * 
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 * 
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 * 
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 * 
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */

package mage.cards.a;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.ContinuousRuleModifyingEffectImpl;
import mage.abilities.effects.RestrictionEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.WatcherScope;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.permanent.Permanent;
import mage.watchers.Watcher;
import mage.watchers.common.CastSpellLastTurnWatcher;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class AngelicArbiter extends CardImpl {

    public AngelicArbiter(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{5}{W}{W}");
        this.subtype.add("Angel");

        this.power = new MageInt(5);
        this.toughness = new MageInt(6);

        // Flying
        this.addAbility(FlyingAbility.getInstance());
        
        // Each opponent who cast a spell this turn can't attack with creatures.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new AngelicArbiterCantAttackTargetEffect(Duration.WhileOnBattlefield)));

        // Each opponent who attacked with a creature this turn can't cast spells.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new AngelicArbiterEffect2()), new AngelicArbiterWatcher2());
    }

    public AngelicArbiter(final AngelicArbiter card) {
        super(card);
    }

    @Override
    public AngelicArbiter copy() {
        return new AngelicArbiter(this);
    }

}

class AngelicArbiterWatcher2 extends Watcher {

    private final Set<UUID> playersThatAttackedThisTurn = new HashSet<>();

    public AngelicArbiterWatcher2() {
        super("PlayerAttacked", WatcherScope.GAME);
    }

    public AngelicArbiterWatcher2(final AngelicArbiterWatcher2 watcher) {
        super(watcher);
        this.playersThatAttackedThisTurn.addAll(watcher.playersThatAttackedThisTurn);
    }

    @Override
    public AngelicArbiterWatcher2 copy() {
        return new AngelicArbiterWatcher2(this);
    }

    @Override
    public void watch(GameEvent event, Game game) {
        if (event.getType() == EventType.DECLARED_ATTACKERS
                && game.getActivePlayerId().equals(event.getPlayerId())
                && game.getOpponents(controllerId).contains(event.getPlayerId())
                && game.getCombat().getAttackerId().equals(event.getPlayerId())
                && !game.getCombat().getAttackers().isEmpty()) {
            playersThatAttackedThisTurn.add(event.getPlayerId());
        }
    }

    @Override
    public void reset() {
        super.reset();
        playersThatAttackedThisTurn.clear();
    }


    public boolean hasPlayerAttackedThisTurn(UUID playerId) {
        return playersThatAttackedThisTurn.contains(playerId);
    }
}

class AngelicArbiterCantAttackTargetEffect extends RestrictionEffect {

    public AngelicArbiterCantAttackTargetEffect(Duration duration) {
        super(duration);
        staticText = "Each opponent who cast a spell this turn can't attack with creatures";
    }

    public AngelicArbiterCantAttackTargetEffect(final AngelicArbiterCantAttackTargetEffect effect) {
        super(effect);
    }

    @Override
    public boolean applies(Permanent permanent, Ability source, Game game) {
        if (game.getActivePlayerId().equals(permanent.getControllerId()) && game.getOpponents(source.getControllerId()).contains(permanent.getControllerId())) {
            CastSpellLastTurnWatcher watcher = (CastSpellLastTurnWatcher) game.getState().getWatchers().get(CastSpellLastTurnWatcher.class.getName());
            if (watcher != null && watcher.getAmountOfSpellsPlayerCastOnCurrentTurn(permanent.getControllerId()) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean canAttack(Game game) {
        return false;
    }

    @Override
    public AngelicArbiterCantAttackTargetEffect copy() {
        return new AngelicArbiterCantAttackTargetEffect(this);
    }
}

class AngelicArbiterEffect2 extends ContinuousRuleModifyingEffectImpl {

    public AngelicArbiterEffect2() {
        super(Duration.WhileOnBattlefield, Outcome.Benefit);
        staticText = "Each opponent who attacked with a creature this turn can't cast spells";
    }

    public AngelicArbiterEffect2(final AngelicArbiterEffect2 effect) {
        super(effect);
    }

    @Override
    public AngelicArbiterEffect2 copy() {
        return new AngelicArbiterEffect2(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == EventType.CAST_SPELL;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        if (game.getActivePlayerId().equals(event.getPlayerId()) && game.getOpponents(source.getControllerId()).contains(event.getPlayerId())) {
            AngelicArbiterWatcher2 watcher = (AngelicArbiterWatcher2) game.getState().getWatchers().get("PlayerAttacked");
            if (watcher != null && watcher.hasPlayerAttackedThisTurn(event.getPlayerId())) {
                return true;
            }
        }
        return false;
    }

}
