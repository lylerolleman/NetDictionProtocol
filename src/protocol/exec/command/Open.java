package protocol.exec.command;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import protocol.ConfigManager;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Lyle on 9/19/2016.
 */
public class Open implements ChainCommand {
    private ChainCommand arg;

    public Open(ChainCommand arg) {
        this.arg = arg;
    }

    @Override
    public CommandReturn execute() {
        if (Desktop.isDesktopSupported())
        {
            try {
                CommandReturn ret = arg.execute();
                if (ret.success) {
                    if (ret.data.equals("search")) {
                        Desktop.getDesktop().browse(new URI("www.google.ca"));
                    }
                    HashMap<String, String> executables = ConfigManager.getExecutablePaths();
                    Set<String> ks = executables.keySet();
                    for (String key : ks) {
                        if (ret.data.equals(key)) {
                            Runtime.getRuntime().exec(executables.get(key));
                        }
                    }
                } else {
                    System.err.println(ret.toString());
                }

            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
        return new CommandReturn(this, "", true);
    }

    @Override
    public String commandName() {
        return "Open";
    }
}
