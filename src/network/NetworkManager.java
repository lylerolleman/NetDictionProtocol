package network;

import protocol.exec.ExecutionManager;
import java.util.ArrayList;

public class NetworkManager {
	private static NetworkListener listener;
	private static ArrayList<NetDictionConnection> connections = new ArrayList();
	
	public static void initNetworkListener() {
		listener = new NetworkListener();
		listener.start();
		ExecutionManager.startConsumer();
	}
	
	public static void initNetworkListener(int port) {
		listener = new NetworkListener(port);
		listener.start();
		ExecutionManager.startConsumer();
	}
	
	public static void registerConnection(NetDictionConnection con) {
		connections.add(con);
	}
	
	public static void closeConnection(NetDictionConnection con) {
		for (int i=0; i<connections.size(); i++) {
			if (con == connections.get(i)) {
				connections.get(i).close();
				connections.remove(i);
			}
		}
	}
	
	public static void closeNetwork() {
		listener.close();
		for (NetDictionConnection con : connections) {
			con.close();
		}
		ExecutionManager.stopConsumer();
	}
}
