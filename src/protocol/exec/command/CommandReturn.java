package protocol.exec.command;

/**
 * Created by Lyle on 8/22/2016.
 */
public class CommandReturn {
    boolean success;
    String data;
    ChainCommand command;

    public CommandReturn(ChainCommand command, String data, boolean success) {
        this.success = success;
        this.data = data;
        this.command = command;
    }

    public String toString() {
        return command.commandName() + ": " + success + ", " + data;
    }
}
