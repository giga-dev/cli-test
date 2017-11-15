package org.niv.commands;

import org.niv.CliCommand;
import org.niv.CliCommandException;
import picocli.CommandLine.*;

@Command(name="demo", header = "Starts a demo environment on the local host")
public class DemoCommand extends CliCommand {
    @Override
    protected void execute() throws Exception {
        throw new CliCommandException("demo is under construction").exitCode(3);
    }
}
