package protocol.exec.command;

import protocol.exec.NetDictionCommand;

import java.util.LinkedList;

/**
 * Created by Lyle on 8/4/2016.
 */
public class CommandThread extends Thread {
    private final LinkedList<ChainCommand> commands;
    private boolean closed = false;

    public CommandThread(LinkedList<ChainCommand> commands) {
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
                    CommandReturn ret = commands.pop().execute();
                    System.err.println("Command: " + ret.command.commandName() + ", success: " + ret.success);
                }
            }
        }
    }

    public void close() {
        closed = true;
    }
}
