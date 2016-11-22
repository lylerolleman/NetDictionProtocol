package protocol.exec;

import protocol.exec.command.ChainCommand;
import protocol.exec.command.CommandThread;

import java.util.LinkedList;


public class ExecutionManager {
	private static final LinkedList<NetDictionCommand> commands = new LinkedList<NetDictionCommand>();
	private static final LinkedList<ChainCommand> chainedcommands = new LinkedList<>();
	private static ConsumerThread ct;
	private static CommandThread comt;
	
	public static void enqueueCommands(LinkedList<NetDictionCommand> nmes) {
		synchronized (commands) {
			commands.addAll(nmes);
			commands.notify();
		}
	}

	public static void enqueueCommand(NetDictionCommand command) {
		synchronized (commands) {
			commands.add(command);
			commands.notify();
		}
	}

	public static void enqueueCommand(ChainCommand command) {
		synchronized (chainedcommands) {
			chainedcommands.add(command);
			chainedcommands.notify();
		}
	}
	
	public static void startConsumer() {
		ct = new ConsumerThread(commands);
		comt = new CommandThread(chainedcommands);
		ct.start();
		comt.start();
	}
	
	public static void stopConsumer() {
		synchronized (commands) {
			commands.clear();
			ct.close();
			commands.notify();
		}
		synchronized (chainedcommands) {
			chainedcommands.clear();
			comt.close();
			chainedcommands.notify();
		}
	}
}
