package sample.websocket;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/broadcast")
public class SampleWebSocketBroadcast {

    @OnMessage
    public void broadcast(String message, Session session) throws IOException {
      session.getOpenSessions().forEach(s -> {
        s.getAsyncRemote().sendText(message);
      });
    }
}
