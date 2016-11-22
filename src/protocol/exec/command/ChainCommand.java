package protocol.exec.command;

/**
 * Created by Lyle on 8/22/2016.
 */
public interface ChainCommand {
    CommandReturn execute();
    String commandName();
}
