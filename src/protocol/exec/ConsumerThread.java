package protocol.exec;

import java.util.LinkedList;


public class ConsumerThread extends Thread {
	private final LinkedList<NetDictionCommand> commands;
	private boolean closed = false;
	
	public ConsumerThread(final LinkedList<NetDictionCommand> commands) {
		this.commands = commands;
	}
	
	public void run() {
		while (true) {
			synchronized (commands) {
				try {
					commands.wait();
					if (closed) {
						return;
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				while (commands.size() > 0) {
					commands.pop().execute();
				}
			}
		}
	}
	
	public void close() {
		closed = true;
	}
}
