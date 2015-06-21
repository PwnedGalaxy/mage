package org.mage.server.test;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import mage.choices.Choice;
import mage.interfaces.ServerState;
import mage.remote.Connection;
import mage.utils.MageVersion;
import mage.view.AbilityPickerView;
import mage.view.CardsView;
import mage.view.ChatMessage;
import mage.view.GameEndView;
import mage.view.GameView;
import mage.view.UserRequestMessage;
import org.mage.network.Client;

import org.mage.network.interfaces.MageClient;
import org.mage.network.model.MessageType;

/**
 *
 * @author BetaSteward
 */
public class TestClient implements MageClient {

    private Client client;
    private ServerState serverState;
    
    public TestClient() {
        client = new Client(this);
    }
    
    public boolean connect() {
        Connection connection = new Connection();
        connection.setHost("localhost");
        connection.setPort(17171);
        connection.setSSL(true);
        connection.setUsername("test_user");
        connection.setForceDBComparison(false);
        return client.connect(connection, MageVersion.getCurrent());
    }
    
    public boolean isConnected() {
        return client.isConnected();
    }
    
    @Override
    public void connected(String message) {
    }

    @Override
    public void disconnected(boolean error) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inform(String title, String message, MessageType type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receiveChatMessage(UUID chatId, ChatMessage message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receiveBroadcastMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clientRegistered(ServerState state) {
        this.serverState = state;
    }

    @Override
    public ServerState getServerState() {
        return serverState;
    }

    @Override
    public void joinedTable(UUID roomId, UUID tableId, UUID chatId, boolean owner, boolean tournament) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gameStarted(UUID gameId, UUID playerId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void initGame(UUID gameId, GameView gameView) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gameAsk(UUID gameId, GameView gameView, String question) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gameTarget(UUID gameId, GameView gameView, String question, CardsView cardView, Set<UUID> targets, boolean required, Map<String, Serializable> options) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gameChooseAbility(UUID gameId, AbilityPickerView abilities) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gameChoosePile(UUID gameId, String message, CardsView pile1, CardsView pile2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gameChooseChoice(UUID gameId, Choice choice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gamePlayMana(UUID gameId, GameView gameView, String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gamePlayXMana(UUID gameId, GameView gameView, String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gameSelectAmount(UUID gameId, String message, int min, int max) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gameSelect(UUID gameId, GameView gameView, String message, Map<String, Serializable> options) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gameEndInfo(UUID gameId, GameEndView view) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void userRequestDialog(UUID gameId, UserRequestMessage userRequestMessage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> getServerMessages() {
        return client.getServerMessages();
    }
    
    public UUID getMainRoomId() {
        return serverState.getMainRoomId();
    }
    
}