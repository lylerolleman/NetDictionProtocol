package protocol;

import network.NetDictionConnection;
import protocol.exec.*;
import protocol.gen.NetDictionBaseListener;
import protocol.gen.NetDictionParser;

/**
 * Created by Lyle on 7/4/2016.
 */
public class NetDictionProtocolListener extends NetDictionBaseListener {
    private NetDictionConnection con;

    public NetDictionProtocolListener(NetDictionConnection con) {
        this.con = con;
    }

    @Override
    public void enterType(NetDictionParser.TypeContext ctx) {
        ExecutionManager.enqueueCommand(new Type(deQuote(ctx.STRING().getText())));
    }

    @Override
    public void enterCommandMessage(NetDictionParser.CommandMessageContext ctx) {
        String command = deQuote(ctx.STRING().getText());
        if (command.length() > 0) {
            ExecutionManager.enqueueCommand(new CommandExecute(command));
        }
    }

    @Override
    public void enterPing(NetDictionParser.PingContext ctx) {
        ExecutionManager.enqueueCommand(new Ping(con));
    }

    @Override
    public void enterDisconnect(NetDictionParser.DisconnectContext ctx) {
        ExecutionManager.enqueueCommand(new Disconnect(con));
    }

    private String deQuote(String st) {
        if (st.startsWith("\"") && st.endsWith("\""))
            return st.substring(1, st.length() - 1);
        return st;
    }
}
