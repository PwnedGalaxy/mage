package org.mage.network.model;

import java.util.UUID;
import mage.view.UserRequestMessage;
import org.mage.network.handlers.client.ClientMessageHandler;

/**
 *
 * @author BetaSteward
 */
public class UserRequestDialogMessage extends ClientMessage {
    private final UUID gameId;
    private final UserRequestMessage userRequestMessage;

    public UserRequestDialogMessage(UUID gameId, UserRequestMessage userRequestMessage) {
        this.gameId = gameId;
        this.userRequestMessage = userRequestMessage;
    }

    @Override
    public void handleMessage(ClientMessageHandler handler) {
        handler.getClient().userRequestDialog(gameId, userRequestMessage);
    }
    
}