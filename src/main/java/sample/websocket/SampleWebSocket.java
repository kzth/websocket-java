package sample.websocket;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo")
public class SampleWebSocket {

  @OnMessage
  public void echo(String message, Session session) throws IOException {
    session.getBasicRemote().sendText(message);
  }
}
