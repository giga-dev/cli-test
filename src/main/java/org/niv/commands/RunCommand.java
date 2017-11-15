package org.niv.commands;

import org.niv.CliCommand;
import org.niv.Program;
import picocli.CommandLine;
import picocli.CommandLine.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Command(name="run", header = "Runs the specified insightedge service(s) on the local host")
public class RunCommand extends CliCommand {

    @Option(names = "--master", description = "Starts a Spark master and a XAP manager")
    boolean master;
    @Option(names = "--worker", description = "Starts a Spark worker")
    boolean worker;
    @Option(names = "--containers", description = "Starts specified number of XAP containers")
    Integer containers;
    @Option(names = "--zeppelin", description = "Starts Apache Zeppelin")
    boolean zeppelin;
    @Option(names = "--manager-local", description = "Starts a local manager")
    boolean localManager;

    @Override
    protected void execute() throws Exception {
        File directory = new File(getXapHome(), "bin");
        File script = new File(directory, "gs-agent" + (isWindows() ? ".bat" : ".sh"));
        List<String> command = new ArrayList<>();
        command.add(script.toString());
        if (master) {
            command.add("--manager");
            command.add("--spark-master");
        }
        if (worker) {
            command.add("--spark-worker");
        }
        if (containers != null && containers > 0) {
            command.add("--gsc=" + containers);
        }
        if (zeppelin) {
            System.out.println("running zeppeling is not supported yet");
        }
        if (localManager) {
            command.add("--manager-local");
        }
        if (command.size() == 1) {
            System.out.println("Nothing to run");
            new CommandLine(new RunCommand()).usage(System.out);
        } else {
            ProcessBuilder processBuilder = new ProcessBuilder()
                    .command(command)
                    .directory(directory)
                    .redirectErrorStream(true)
                    .redirectOutput(ProcessBuilder.Redirect.INHERIT);

            System.out.println("Starting: " + command);
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("Process exited: " + exitCode);
        }
    }

    private File getXapHome() {
        // TODO: Get XAP home via config (e.g. env var, sys prop)
        return new File("C:\\gigaspaces\\gigaspaces-xap-12.2.0-ga-b18000");
    }

    private static boolean isWindows() {
        return File.separatorChar == '\\';
    }
}
