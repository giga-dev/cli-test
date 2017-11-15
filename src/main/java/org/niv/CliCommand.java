package org.niv;

import picocli.CommandLine.*;

import java.util.concurrent.Callable;

@Command(version = {"12.3", "All Rights Reserved"}, // TODO: load version info from elsewhere.
        sortOptions = false,
        //headerHeading = "",
        header = "<header goes here>",
        synopsisHeading = "%nUsage: ",
        descriptionHeading = "%nDescription: ",
        //description = "<description goes here>",
        parameterListHeading = "%nParameters:%n",
        optionListHeading = "%nOptions:%n")
public abstract class CliCommand implements Callable<Object> {

    @Option(names = {"--help"}, usageHelp = true, description = "display this help message")
    boolean usageHelpRequested;

    @Override
    public Object call() throws Exception {
        beforeExecute();
        execute();
        return null;
    }

    protected void beforeExecute() {

    }

    protected abstract void execute() throws Exception;
}
