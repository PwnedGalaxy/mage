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
package mage.cards.f;

import java.util.UUID;
import mage.abilities.condition.InvertCondition;
import mage.abilities.condition.common.HateCondition;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.common.CounterTargetEffect;
import mage.abilities.effects.common.CounterUnlessPaysEffect;
import mage.abilities.effects.keyword.ScryEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.target.TargetSpell;
import mage.watchers.common.LifeLossOtherFromCombatWatcher;

/**
 *
 * @author Styxo
 */
public class ForceDenial extends CardImpl {

    public ForceDenial(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.INSTANT},"{1}{U}");

        // Counter target  spell unless its controller pays {1}.
        this.getSpellAbility().addEffect(new ConditionalOneShotEffect(
                new CounterUnlessPaysEffect(new GenericManaCost(1)),
                new InvertCondition(HateCondition.instance),
                "Counter target spell unless its controller pays {1}."));

        // <i>Hate</i> &mdash; If an opponent lost life from a source other then combat damage this turn, counter that spell instead.
        this.getSpellAbility().addEffect(new ConditionalOneShotEffect(
                new CounterTargetEffect(),
                HateCondition.instance,
                "<br><i>Hate</i> - If an opponent lost life from a source other than combat damage this turn, counter that spell instead."));
        this.getSpellAbility().addTarget(new TargetSpell());
        this.getSpellAbility().addWatcher(new LifeLossOtherFromCombatWatcher());

        // Scry 1
        this.getSpellAbility().addEffect(new ScryEffect(1));
    }

    public ForceDenial(final ForceDenial card) {
        super(card);
    }

    @Override
    public ForceDenial copy() {
        return new ForceDenial(this);
    }
}
