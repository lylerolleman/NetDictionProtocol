package protocol.exec.command;

/**
 * Created by Lyle on 9/19/2016.
 */
public class Literal implements ChainCommand {
    private String text = "";

    public Literal(String text) {
        this.text = text;
    }

    @Override
    public CommandReturn execute() {
        return new CommandReturn(this, text, true);
    }

    @Override
    public String commandName() {
        return "Literal";
    }
}
