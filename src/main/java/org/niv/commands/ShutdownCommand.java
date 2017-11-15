package org.niv.commands;

import org.niv.CliCommand;
import picocli.CommandLine.*;

@Command(name="shutdown", header = "Shuts down InsightEdge environment on the local host")
public class ShutdownCommand extends CliCommand {
    @Override
    protected void execute() throws Exception {
        //System.out.println("shutdown is under construction");
        throw new RuntimeException("shutdown is under construction");
    }
}
