package protocol.exec;


import protocol.exec.command.ChainCommand;
import protocol.exec.command.Literal;
import protocol.exec.command.Open;

import java.util.LinkedList;

/**
 * Created by Lyle on 7/28/2016.
 */
public class CommandExecute implements NetDictionCommand {
    private String text;

    public CommandExecute(String text) {
        this.text = text;
    }
    @Override
    public void execute() {
        System.err.println("Executing command: " + text );
        String[] args = text.trim().toLowerCase().split(" ");
        ExecutionManager.enqueueCommand(recognize(args, 0));
    }

    public ChainCommand recognize(String[] args, int index) {
        try {
            switch (args[index].trim()) {
                case "open":
                    return new Open(recognize(args, index+1));
                default:
                    return new Literal(args[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return new Literal("");
        }
    }
}
