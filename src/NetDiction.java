import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import network.NetworkManager;
import protocol.exec.CommandExecute;
import protocol.exec.ExecutionManager;

public class NetDiction {

	public static void main(String[] args) {
		/*if (args.length != 0)
			NetworkManager.initNetworkListener(Integer.parseInt(args[0]));
		else
			NetworkManager.initNetworkListener(10125);
		*/
		ExecutionManager.startConsumer();
		String command = "";
		for (String arg : args)
			command += " " + arg;
		ExecutionManager.enqueueCommand(new CommandExecute(command));
		/*try {
			Socket socket = new Socket("127.0.0.1", 10125);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream( )));
			writer.write("TYPE \"test message\";\r\n");
			writer.flush();
			writer.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}
