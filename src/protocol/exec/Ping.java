package protocol.exec;

import network.NetDictionConnection;

public class Ping implements NetDictionCommand {
	private NetDictionConnection con;
	
	public Ping(NetDictionConnection con) {
		this.con = con;
	}
	
	@Override
	public void execute() {
		String name = System.getenv("COMPUTERNAME");
		if (name != null) {
			con.write("REPLY " + name + ";\r\n");
		} else {
			con.write("REPLY " + con.getAddress() + ";\r\n");
		}
	}

}
