package mage.server.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mage.constants.Zone;
import mage.game.match.Match;

/**
 * C U R R E N T L Y    U N U S E D 
 *
 * Loads challenges from scenarios.
 * Configure games by initializing starting game board.
 */
public class ChallengeManager {

    public static final ChallengeManager instance = new ChallengeManager();

    public static ChallengeManager getInstance() {
        return instance;
    }

    public void prepareChallenge(UUID playerId, Match match) {
        Map<Zone, String> commands = new HashMap<>();
        commands.put(Zone.OUTSIDE, "life:3");
        match.getGame().cheat(playerId, commands);
    }
}
