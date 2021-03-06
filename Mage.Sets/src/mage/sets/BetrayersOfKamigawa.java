/*
 * Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.constants.SetType;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;

/**
 *
 * @author North
 */
public class BetrayersOfKamigawa extends ExpansionSet {

    private static final BetrayersOfKamigawa instance = new BetrayersOfKamigawa();

    public static BetrayersOfKamigawa getInstance() {
        return instance;
    }

    private BetrayersOfKamigawa() {
        super("Betrayers of Kamigawa", "BOK", ExpansionSet.buildDate(2005, 1, 4), SetType.EXPANSION);
        this.blockName = "Kamigawa";
        this.parentSet = ChampionsOfKamigawa.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Akki Blizzard-Herder", 91, Rarity.COMMON, mage.cards.a.AkkiBlizzardHerder.class));
        cards.add(new SetCardInfo("Akki Raider", 92, Rarity.UNCOMMON, mage.cards.a.AkkiRaider.class));
        cards.add(new SetCardInfo("Ashen Monstrosity", 93, Rarity.UNCOMMON, mage.cards.a.AshenMonstrosity.class));
        cards.add(new SetCardInfo("Aura Barbs", 94, Rarity.UNCOMMON, mage.cards.a.AuraBarbs.class));
        cards.add(new SetCardInfo("Baku Altar", 152, Rarity.RARE, mage.cards.b.BakuAltar.class));
        cards.add(new SetCardInfo("Bile Urchin", 61, Rarity.COMMON, mage.cards.b.BileUrchin.class));
        cards.add(new SetCardInfo("Blademane Baku", 95, Rarity.COMMON, mage.cards.b.BlademaneBaku.class));
        cards.add(new SetCardInfo("Blazing Shoal", 96, Rarity.RARE, mage.cards.b.BlazingShoal.class));
        cards.add(new SetCardInfo("Blessing of Leeches", 62, Rarity.COMMON, mage.cards.b.BlessingOfLeeches.class));
        cards.add(new SetCardInfo("Blinding Powder", 153, Rarity.UNCOMMON, mage.cards.b.BlindingPowder.class));
        cards.add(new SetCardInfo("Body of Jukai", 121, Rarity.UNCOMMON, mage.cards.b.BodyOfJukai.class));
        cards.add(new SetCardInfo("Budoka Pupil", 122, Rarity.UNCOMMON, mage.cards.b.BudokaPupil.class));
        cards.add(new SetCardInfo("Call for Blood", 63, Rarity.COMMON, mage.cards.c.CallForBlood.class));
        cards.add(new SetCardInfo("Callow Jushi", 31, Rarity.UNCOMMON, mage.cards.c.CallowJushi.class));
        cards.add(new SetCardInfo("Child of Thorns", 123, Rarity.COMMON, mage.cards.c.ChildOfThorns.class));
        cards.add(new SetCardInfo("Chisei, Heart of Oceans", 32, Rarity.RARE, mage.cards.c.ChiseiHeartOfOceans.class));
        cards.add(new SetCardInfo("Clash of Realities", 97, Rarity.RARE, mage.cards.c.ClashOfRealities.class));
        cards.add(new SetCardInfo("Crack the Earth", 98, Rarity.COMMON, mage.cards.c.CrackTheEarth.class));
        cards.add(new SetCardInfo("Crawling Filth", 64, Rarity.COMMON, mage.cards.c.CrawlingFilth.class));
        cards.add(new SetCardInfo("Cunning Bandit", 99, Rarity.UNCOMMON, mage.cards.c.CunningBandit.class));
        cards.add(new SetCardInfo("Day of Destiny", 1, Rarity.RARE, mage.cards.d.DayOfDestiny.class));
        cards.add(new SetCardInfo("Disrupting Shoal", 33, Rarity.RARE, mage.cards.d.DisruptingShoal.class));
        cards.add(new SetCardInfo("Empty-Shrine Kannushi", 2, Rarity.UNCOMMON, mage.cards.e.EmptyShrineKannushi.class));
        cards.add(new SetCardInfo("Enshrined Memories", 124, Rarity.RARE, mage.cards.e.EnshrinedMemories.class));
        cards.add(new SetCardInfo("Eradicate", 65, Rarity.UNCOMMON, mage.cards.e.Eradicate.class));
        cards.add(new SetCardInfo("Faithful Squire", 3, Rarity.UNCOMMON, mage.cards.f.FaithfulSquire.class));
        cards.add(new SetCardInfo("Final Judgment", 4, Rarity.RARE, mage.cards.f.FinalJudgment.class));
        cards.add(new SetCardInfo("First Volley", 100, Rarity.COMMON, mage.cards.f.FirstVolley.class));
        cards.add(new SetCardInfo("Flames of the Blood Hand", 101, Rarity.UNCOMMON, mage.cards.f.FlamesOfTheBloodHand.class));
        cards.add(new SetCardInfo("Floodbringer", 34, Rarity.COMMON, mage.cards.f.Floodbringer.class));
        cards.add(new SetCardInfo("Forked-Branch Garami", 125, Rarity.UNCOMMON, mage.cards.f.ForkedBranchGarami.class));
        cards.add(new SetCardInfo("Frostling", 103, Rarity.COMMON, mage.cards.f.Frostling.class));
        cards.add(new SetCardInfo("Frost Ogre", 102, Rarity.COMMON, mage.cards.f.FrostOgre.class));
        cards.add(new SetCardInfo("Fumiko the Lowblood", 104, Rarity.RARE, mage.cards.f.FumikoTheLowblood.class));
        cards.add(new SetCardInfo("Genju of the Cedars", 126, Rarity.UNCOMMON, mage.cards.g.GenjuOfTheCedars.class));
        cards.add(new SetCardInfo("Genju of the Falls", 35, Rarity.UNCOMMON, mage.cards.g.GenjuOfTheFalls.class));
        cards.add(new SetCardInfo("Genju of the Fens", 66, Rarity.UNCOMMON, mage.cards.g.GenjuOfTheFens.class));
        cards.add(new SetCardInfo("Genju of the Fields", 5, Rarity.UNCOMMON, mage.cards.g.GenjuOfTheFields.class));
        cards.add(new SetCardInfo("Genju of the Realm", 151, Rarity.RARE, mage.cards.g.GenjuOfTheRealm.class));
        cards.add(new SetCardInfo("Genju of the Spires", 105, Rarity.UNCOMMON, mage.cards.g.GenjuOfTheSpires.class));
        cards.add(new SetCardInfo("Gnarled Mass", 127, Rarity.COMMON, mage.cards.g.GnarledMass.class));
        cards.add(new SetCardInfo("Goblin Cohort", 106, Rarity.COMMON, mage.cards.g.GoblinCohort.class));
        cards.add(new SetCardInfo("Gods' Eye, Gate to the Reikai", 164, Rarity.UNCOMMON, mage.cards.g.GodsEyeGateToTheReikai.class));
        cards.add(new SetCardInfo("Goryo's Vengeance", 67, Rarity.RARE, mage.cards.g.GoryosVengeance.class));
        cards.add(new SetCardInfo("Harbinger of Spring", 128, Rarity.COMMON, mage.cards.h.HarbingerOfSpring.class));
        cards.add(new SetCardInfo("Heartless Hidetsugu", 107, Rarity.RARE, mage.cards.h.HeartlessHidetsugu.class));
        cards.add(new SetCardInfo("Heart of Light", 6, Rarity.COMMON, mage.cards.h.HeartOfLight.class));
        cards.add(new SetCardInfo("Heed the Mists", 36, Rarity.UNCOMMON, mage.cards.h.HeedTheMists.class));
        cards.add(new SetCardInfo("Hero's Demise", 68, Rarity.RARE, mage.cards.h.HerosDemise.class));
        cards.add(new SetCardInfo("Higure, the Still Wind", 37, Rarity.RARE, mage.cards.h.HigureTheStillWind.class));
        cards.add(new SetCardInfo("Hired Muscle", 69, Rarity.UNCOMMON, mage.cards.h.HiredMuscle.class));
        cards.add(new SetCardInfo("Hokori, Dust Drinker", 7, Rarity.RARE, mage.cards.h.HokoriDustDrinker.class));
        cards.add(new SetCardInfo("Horobi's Whisper", 70, Rarity.COMMON, mage.cards.h.HorobisWhisper.class));
        cards.add(new SetCardInfo("Hundred-Talon Strike", 8, Rarity.COMMON, mage.cards.h.HundredTalonStrike.class));
        cards.add(new SetCardInfo("Indebted Samurai", 9, Rarity.UNCOMMON, mage.cards.i.IndebtedSamurai.class));
        cards.add(new SetCardInfo("Ink-Eyes, Servant of Oni", 71, Rarity.RARE, mage.cards.i.InkEyesServantOfOni.class));
        cards.add(new SetCardInfo("In the Web of War", 108, Rarity.RARE, mage.cards.i.InTheWebOfWar.class));
        cards.add(new SetCardInfo("Ire of Kaminari", 109, Rarity.COMMON, mage.cards.i.IreOfKaminari.class));
        cards.add(new SetCardInfo("Isao, Enlightened Bushi", 129, Rarity.RARE, mage.cards.i.IsaoEnlightenedBushi.class));
        cards.add(new SetCardInfo("Ishi-Ishi, Akki Crackshot", 110, Rarity.RARE, mage.cards.i.IshiIshiAkkiCrackshot.class));
        cards.add(new SetCardInfo("Iwamori of the Open Fist", 130, Rarity.RARE, mage.cards.i.IwamoriOfTheOpenFist.class));
        cards.add(new SetCardInfo("Jetting Glasskite", 38, Rarity.UNCOMMON, mage.cards.j.JettingGlasskite.class));
        cards.add(new SetCardInfo("Kaijin of the Vanishing Touch", 39, Rarity.UNCOMMON, mage.cards.k.KaijinOfTheVanishingTouch.class));
        cards.add(new SetCardInfo("Kami of False Hope", 10, Rarity.COMMON, mage.cards.k.KamiOfFalseHope.class));
        cards.add(new SetCardInfo("Kami of Tattered Shoji", 11, Rarity.COMMON, mage.cards.k.KamiOfTatteredShoji.class));
        cards.add(new SetCardInfo("Kami of the Honored Dead", 12, Rarity.UNCOMMON, mage.cards.k.KamiOfTheHonoredDead.class));
        cards.add(new SetCardInfo("Kentaro, the Smiling Cat", 13, Rarity.RARE, mage.cards.k.KentaroTheSmilingCat.class));
        cards.add(new SetCardInfo("Kira, Great Glass-Spinner", 40, Rarity.RARE, mage.cards.k.KiraGreatGlassSpinner.class));
        cards.add(new SetCardInfo("Kitsune Palliator", 14, Rarity.UNCOMMON, mage.cards.k.KitsunePalliator.class));
        cards.add(new SetCardInfo("Kodama of the Center Tree", 131, Rarity.RARE, mage.cards.k.KodamaOfTheCenterTree.class));
        cards.add(new SetCardInfo("Kumano's Blessing", 111, Rarity.COMMON, mage.cards.k.KumanosBlessing.class));
        cards.add(new SetCardInfo("Kyoki, Sanity's Eclipse", 72, Rarity.RARE, mage.cards.k.KyokiSanitysEclipse.class));
        cards.add(new SetCardInfo("Lifegift", 132, Rarity.RARE, mage.cards.l.Lifegift.class));
        cards.add(new SetCardInfo("Lifespinner", 133, Rarity.UNCOMMON, mage.cards.l.Lifespinner.class));
        cards.add(new SetCardInfo("Loam Dweller", 134, Rarity.UNCOMMON, mage.cards.l.LoamDweller.class));
        cards.add(new SetCardInfo("Mannichi, the Fevered Dream", 112, Rarity.RARE, mage.cards.m.MannichiTheFeveredDream.class));
        cards.add(new SetCardInfo("Mark of Sakiko", 135, Rarity.UNCOMMON, mage.cards.m.MarkOfSakiko.class));
        cards.add(new SetCardInfo("Mark of the Oni", 73, Rarity.UNCOMMON, mage.cards.m.MarkOfTheOni.class));
        cards.add(new SetCardInfo("Matsu-Tribe Sniper", 136, Rarity.COMMON, mage.cards.m.MatsuTribeSniper.class));
        cards.add(new SetCardInfo("Mending Hands", 15, Rarity.COMMON, mage.cards.m.MendingHands.class));
        cards.add(new SetCardInfo("Minamo Sightbender", 41, Rarity.UNCOMMON, mage.cards.m.MinamoSightbender.class));
        cards.add(new SetCardInfo("Minamo's Meddling", 42, Rarity.COMMON, mage.cards.m.MinamosMeddling.class));
        cards.add(new SetCardInfo("Mirror Gallery", 154, Rarity.RARE, mage.cards.m.MirrorGallery.class));
        cards.add(new SetCardInfo("Mistblade Shinobi", 43, Rarity.COMMON, mage.cards.m.MistbladeShinobi.class));
        cards.add(new SetCardInfo("Moonlit Strider", 16, Rarity.COMMON, mage.cards.m.MoonlitStrider.class));
        cards.add(new SetCardInfo("Neko-Te", 155, Rarity.RARE, mage.cards.n.NekoTe.class));
        cards.add(new SetCardInfo("Nezumi Shadow-Watcher", 74, Rarity.UNCOMMON, mage.cards.n.NezumiShadowWatcher.class));
        cards.add(new SetCardInfo("Ninja of the Deep Hours", 44, Rarity.COMMON, mage.cards.n.NinjaOfTheDeepHours.class));
        cards.add(new SetCardInfo("Nourishing Shoal", 137, Rarity.RARE, mage.cards.n.NourishingShoal.class));
        cards.add(new SetCardInfo("Ogre Marauder", 75, Rarity.UNCOMMON, mage.cards.o.OgreMarauder.class));
        cards.add(new SetCardInfo("Ogre Recluse", 113, Rarity.UNCOMMON, mage.cards.o.OgreRecluse.class));
        cards.add(new SetCardInfo("Okiba-Gang Shinobi", 76, Rarity.COMMON, mage.cards.o.OkibaGangShinobi.class));
        cards.add(new SetCardInfo("Opal-Eye, Konda's Yojimbo", 17, Rarity.RARE, mage.cards.o.OpalEyeKondasYojimbo.class));
        cards.add(new SetCardInfo("Orb of Dreams", 156, Rarity.RARE, mage.cards.o.OrbOfDreams.class));
        cards.add(new SetCardInfo("Ornate Kanzashi", 157, Rarity.RARE, mage.cards.o.OrnateKanzashi.class));
        cards.add(new SetCardInfo("Overblaze", 114, Rarity.UNCOMMON, mage.cards.o.Overblaze.class));
        cards.add(new SetCardInfo("Oyobi, Who Split the Heavens", 18, Rarity.RARE, mage.cards.o.OyobiWhoSplitTheHeavens.class));
        cards.add(new SetCardInfo("Patron of the Akki", 115, Rarity.RARE, mage.cards.p.PatronOfTheAkki.class));
        cards.add(new SetCardInfo("Patron of the Kitsune", 19, Rarity.RARE, mage.cards.p.PatronOfTheKitsune.class));
        cards.add(new SetCardInfo("Patron of the Moon", 45, Rarity.RARE, mage.cards.p.PatronOfTheMoon.class));
        cards.add(new SetCardInfo("Patron of the Nezumi", 77, Rarity.RARE, mage.cards.p.PatronOfTheNezumi.class));
        cards.add(new SetCardInfo("Patron of the Orochi", 138, Rarity.RARE, mage.cards.p.PatronOfTheOrochi.class));
        cards.add(new SetCardInfo("Petalmane Baku", 139, Rarity.COMMON, mage.cards.p.PetalmaneBaku.class));
        cards.add(new SetCardInfo("Phantom Wings", 46, Rarity.COMMON, mage.cards.p.PhantomWings.class));
        cards.add(new SetCardInfo("Psychic Spear", 78, Rarity.COMMON, mage.cards.p.PsychicSpear.class));
        cards.add(new SetCardInfo("Pus Kami", 79, Rarity.UNCOMMON, mage.cards.p.PusKami.class));
        cards.add(new SetCardInfo("Quash", 47, Rarity.UNCOMMON, mage.cards.q.Quash.class));
        cards.add(new SetCardInfo("Quillmane Baku", 48, Rarity.COMMON, mage.cards.q.QuillmaneBaku.class));
        cards.add(new SetCardInfo("Reduce to Dreams", 49, Rarity.RARE, mage.cards.r.ReduceToDreams.class));
        cards.add(new SetCardInfo("Ribbons of the Reikai", 50, Rarity.COMMON, mage.cards.r.RibbonsOfTheReikai.class));
        cards.add(new SetCardInfo("Roar of Jukai", 140, Rarity.COMMON, mage.cards.r.RoarOfJukai.class));
        cards.add(new SetCardInfo("Ronin Cliffrider", 116, Rarity.UNCOMMON, mage.cards.r.RoninCliffrider.class));
        cards.add(new SetCardInfo("Ronin Warclub", 158, Rarity.UNCOMMON, mage.cards.r.RoninWarclub.class));
        cards.add(new SetCardInfo("Sakiko, Mother of Summer", 141, Rarity.RARE, mage.cards.s.SakikoMotherOfSummer.class));
        cards.add(new SetCardInfo("Sakura-Tribe Springcaller", 142, Rarity.COMMON, mage.cards.s.SakuraTribeSpringcaller.class));
        cards.add(new SetCardInfo("Scaled Hulk", 143, Rarity.COMMON, mage.cards.s.ScaledHulk.class));
        cards.add(new SetCardInfo("Scour", 20, Rarity.UNCOMMON, mage.cards.s.Scour.class));
        cards.add(new SetCardInfo("Scourge of Numai", 80, Rarity.UNCOMMON, mage.cards.s.ScourgeOfNumai.class));
        cards.add(new SetCardInfo("Shimmering Glasskite", 51, Rarity.COMMON, mage.cards.s.ShimmeringGlasskite.class));
        cards.add(new SetCardInfo("Shining Shoal", 21, Rarity.RARE, mage.cards.s.ShiningShoal.class));
        cards.add(new SetCardInfo("Shinka Gatekeeper", 117, Rarity.COMMON, mage.cards.s.ShinkaGatekeeper.class));
        cards.add(new SetCardInfo("Shirei, Shizo's Caretaker", 81, Rarity.RARE, mage.cards.s.ShireiShizosCaretaker.class));
        cards.add(new SetCardInfo("Shizuko, Caller of Autumn", 144, Rarity.RARE, mage.cards.s.ShizukoCallerOfAutumn.class));
        cards.add(new SetCardInfo("Shuko", 159, Rarity.UNCOMMON, mage.cards.s.Shuko.class));
        cards.add(new SetCardInfo("Shuriken", 160, Rarity.UNCOMMON, mage.cards.s.Shuriken.class));
        cards.add(new SetCardInfo("Sickening Shoal", 82, Rarity.RARE, mage.cards.s.SickeningShoal.class));
        cards.add(new SetCardInfo("Silverstorm Samurai", 22, Rarity.COMMON, mage.cards.s.SilverstormSamurai.class));
        cards.add(new SetCardInfo("Skullmane Baku", 83, Rarity.COMMON, mage.cards.s.SkullmaneBaku.class));
        cards.add(new SetCardInfo("Skullsnatcher", 84, Rarity.COMMON, mage.cards.s.Skullsnatcher.class));
        cards.add(new SetCardInfo("Slumbering Tora", 161, Rarity.RARE, mage.cards.s.SlumberingTora.class));
        cards.add(new SetCardInfo("Soratami Mindsweeper", 52, Rarity.UNCOMMON, mage.cards.s.SoratamiMindsweeper.class));
        cards.add(new SetCardInfo("Sosuke's Summons", 145, Rarity.UNCOMMON, mage.cards.s.SosukesSummons.class));
        cards.add(new SetCardInfo("Sowing Salt", 118, Rarity.UNCOMMON, mage.cards.s.SowingSalt.class));
        cards.add(new SetCardInfo("Splinter", 146, Rarity.UNCOMMON, mage.cards.s.Splinter.class));
        cards.add(new SetCardInfo("Split-Tail Miko", 23, Rarity.COMMON, mage.cards.s.SplitTailMiko.class));
        cards.add(new SetCardInfo("Stir the Grave", 85, Rarity.COMMON, mage.cards.s.StirTheGrave.class));
        cards.add(new SetCardInfo("Stream of Consciousness", 53, Rarity.UNCOMMON, mage.cards.s.StreamOfConsciousness.class));
        cards.add(new SetCardInfo("Sway of the Stars", 54, Rarity.RARE, mage.cards.s.SwayOfTheStars.class));
        cards.add(new SetCardInfo("Takeno's Cavalry", 24, Rarity.COMMON, mage.cards.t.TakenosCavalry.class));
        cards.add(new SetCardInfo("Takenuma Bleeder", 86, Rarity.COMMON, mage.cards.t.TakenumaBleeder.class));
        cards.add(new SetCardInfo("Tallowisp", 25, Rarity.UNCOMMON, mage.cards.t.Tallowisp.class));
        cards.add(new SetCardInfo("Teardrop Kami", 55, Rarity.COMMON, mage.cards.t.TeardropKami.class));
        cards.add(new SetCardInfo("Tendo Ice Bridge", 165, Rarity.RARE, mage.cards.t.TendoIceBridge.class));
        cards.add(new SetCardInfo("Terashi's Grasp", 26, Rarity.COMMON, mage.cards.t.TerashisGrasp.class));
        cards.add(new SetCardInfo("Terashi's Verdict", 27, Rarity.UNCOMMON, mage.cards.t.TerashisVerdict.class));
        cards.add(new SetCardInfo("That Which Was Taken", 162, Rarity.RARE, mage.cards.t.ThatWhichWasTaken.class));
        cards.add(new SetCardInfo("Threads of Disloyalty", 56, Rarity.RARE, mage.cards.t.ThreadsOfDisloyalty.class));
        cards.add(new SetCardInfo("Three Tragedies", 87, Rarity.UNCOMMON, mage.cards.t.ThreeTragedies.class));
        cards.add(new SetCardInfo("Throat Slitter", 88, Rarity.UNCOMMON, mage.cards.t.ThroatSlitter.class));
        cards.add(new SetCardInfo("Toils of Night and Day", 57, Rarity.COMMON, mage.cards.t.ToilsOfNightAndDay.class));
        cards.add(new SetCardInfo("Tomorrow, Azami's Familiar", 58, Rarity.RARE, mage.cards.t.TomorrowAzamisFamiliar.class));
        cards.add(new SetCardInfo("Torrent of Stone", 119, Rarity.COMMON, mage.cards.t.TorrentOfStone.class));
        cards.add(new SetCardInfo("Toshiro Umezawa", 89, Rarity.RARE, mage.cards.t.ToshiroUmezawa.class));
        cards.add(new SetCardInfo("Traproot Kami", 147, Rarity.COMMON, mage.cards.t.TraprootKami.class));
        cards.add(new SetCardInfo("Twist Allegiance", 120, Rarity.RARE, mage.cards.t.TwistAllegiance.class));
        cards.add(new SetCardInfo("Umezawa's Jitte", 163, Rarity.RARE, mage.cards.u.UmezawasJitte.class));
        cards.add(new SetCardInfo("Unchecked Growth", 148, Rarity.UNCOMMON, mage.cards.u.UncheckedGrowth.class));
        cards.add(new SetCardInfo("Uproot", 149, Rarity.COMMON, mage.cards.u.Uproot.class));
        cards.add(new SetCardInfo("Veil of Secrecy", 59, Rarity.COMMON, mage.cards.v.VeilOfSecrecy.class));
        cards.add(new SetCardInfo("Vital Surge", 150, Rarity.COMMON, mage.cards.v.VitalSurge.class));
        cards.add(new SetCardInfo("Walker of Secret Ways", 60, Rarity.UNCOMMON, mage.cards.w.WalkerOfSecretWays.class));
        cards.add(new SetCardInfo("Ward of Piety", 28, Rarity.UNCOMMON, mage.cards.w.WardOfPiety.class));
        cards.add(new SetCardInfo("Waxmane Baku", 29, Rarity.COMMON, mage.cards.w.WaxmaneBaku.class));
        cards.add(new SetCardInfo("Yomiji, Who Bars the Way", 30, Rarity.RARE, mage.cards.y.YomijiWhoBarsTheWay.class));
        cards.add(new SetCardInfo("Yukora, the Prisoner", 90, Rarity.RARE, mage.cards.y.YukoraThePrisoner.class));
    }
}
