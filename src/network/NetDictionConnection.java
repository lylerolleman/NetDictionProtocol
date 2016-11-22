package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import protocol.NetDictionProtocolListener;
import protocol.gen.NetDictionLexer;
import protocol.gen.NetDictionParser;

public class NetDictionConnection extends Thread {
	private Socket socket;
	
	public NetDictionConnection(Socket socket) {
		this.socket = socket;
		NetworkManager.registerConnection(this);
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream( )));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				NetDictionLexer lexer = new NetDictionLexer(new ANTLRInputStream(line));
				CommonTokenStream tokenstream = new CommonTokenStream(lexer);
				NetDictionParser parser = new NetDictionParser(tokenstream);

				ParseTreeWalker walker = new ParseTreeWalker();
				NetDictionProtocolListener listener = new NetDictionProtocolListener(this);
				walker.walk(listener, parser.commands());
			}
		} catch (IOException | RecognitionException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	
	public String getAddress() {
		return socket.getInetAddress().getHostAddress();
	}
	
	public void write(String message) {
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream( )));
			writer.write(message);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
