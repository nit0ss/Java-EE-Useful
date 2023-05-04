package server.ws;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocketendpoint")
public class WebSocketserver{
	
	
	@OnOpen
	public void onOpen() {
		System.out.println("Abriendo conexion...");
	}
	
	@OnClose
	public void onClose() {
		System.out.println("Cerrando conexion...");
	}
	@OnError	
	public void onError(Throwable e) {
		e.printStackTrace();
	}
	@OnMessage
	public String onMessage(String mensaje) {
	
		System.out.println("Mensaje del cliente " + mensaje);
		String echoMsg = "Echo del servidor : " + mensaje;
		return echoMsg;
	}
	
	
	
	
}