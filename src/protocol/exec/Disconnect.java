package protocol.exec;

import network.NetworkManager;
import network.NetDictionConnection;

public class Disconnect implements NetDictionCommand {
	private NetDictionConnection con;
	
	public Disconnect(NetDictionConnection con) {
		this.con = con;
	}
	
	@Override
	public void execute() {
		NetworkManager.closeConnection(con);
	}

}
