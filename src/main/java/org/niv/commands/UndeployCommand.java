package org.niv.commands;

import org.niv.CliCommand;
import picocli.CommandLine.*;

@Command(name="undeploy", header = "Undeploys space with the specified name")
public class UndeployCommand extends CliCommand {

    @Parameters(index = "0", description = "Name of space to undeploy")
    private String spaceName;

    @Override
    protected void execute() throws Exception {
        System.out.println("undeploy is under construction");
    }
}
