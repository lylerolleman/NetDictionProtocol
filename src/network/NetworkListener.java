package network;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;

import display.DisplayManager;

public class NetworkListener extends Thread {
	private Integer port;
	private ServerSocket ss;
	
	public NetworkListener(Integer port) {
		this.port = port;
	}
	
	public NetworkListener() {
		this(null);
	}
	
	public void run() {
		try {
			if (port != null) {
				ss = new ServerSocket(port);
			} else {
				port = 10125;
				while (true) {
					try {
						ss = new ServerSocket(port);
					} catch (BindException be) {
						port++;
						continue;
					}
					break;
				}
			}
			DisplayManager.displayPortFeedback("Listening on: " + port.toString());
			while (true) {
				new NetDictionConnection(ss.accept()).start();
				System.out.println("new connection established");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
