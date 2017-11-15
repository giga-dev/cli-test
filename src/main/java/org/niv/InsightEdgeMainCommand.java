package org.niv;

import io.swagger.client.Configuration;
import picocli.AutoComplete;
import picocli.CommandLine;
import picocli.CommandLine.*;

import java.io.File;
import java.util.Map;

@Command(name="insightedge", header = {
        "@|green    _____           _       _     _   ______    _                 |@",
        "@|green   |_   _|         (_)     | |   | | |  ____|  | |                |@",
        "@|green     | |  _ __  ___ _  __ _| |__ | |_| |__   __| | __ _  ___      |@",
        "@|green     | | | '_ \\/ __| |/ _` | '_ \\| __|  __| / _` |/ _` |/ _ \\  |@",
        "@|green    _| |_| | | \\__ \\ | (_| | | | | |_| |___| (_| | (_| |  __/   |@",
        "@|green   |_____|_| |_|___/_|\\__, |_| |_|\\__|______\\__,_|\\__, |\\___||@",
        "@|green                       __/ |                       __/ |          |@",
        "@|green                      |___/                       |___/           |@",
})
public class InsightEdgeMainCommand extends CliCommand {
    @Option(names = {"-D"}, description = "Sets java system properties", paramLabel = "key=value")
    Map<String, String> systemProperties;

    @Option(names = {"--tab"}, description = "Generates an auto-complete script for bash")
    boolean generateAutoComplete;

    protected void execute() throws Exception {
        if (systemProperties != null) {
            for (Map.Entry<String, String> entry : systemProperties.entrySet()) {
                System.out.println("Setting Java property: " + entry.getKey() + "=" + entry.getValue());
                System.setProperty(entry.getKey(), entry.getValue());
            }
        }

        if (generateAutoComplete) {
            CommandLine cmd = Program.getInstance().getCmd();
            String commandName = new CommandLine.Help(cmd.getCommand()).commandName;
            File autoCompleteScript = new File(commandName + "_completion");
            AutoComplete.bash(commandName, autoCompleteScript, null, cmd);
            System.out.println("Generated autocomplete script: " + autoCompleteScript.getName());
            System.out.println("To activate autocomplete, source the script (e.g. `. " + autoCompleteScript.getName() + "`)");
        }
    }
}
