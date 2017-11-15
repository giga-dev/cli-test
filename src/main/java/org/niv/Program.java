package org.niv;

import org.niv.commands.*;
import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Program {

    private static Program program;
    private final CommandLine cmd;

    public static Program getInstance() {
        return program;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        program = new Program(new InsightEdgeMainCommand(), getSubcommands());
        int exitCode = program.execute(args);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("insightedge completed - duration=" + duration + ", exitCode = " + exitCode);
        System.exit(exitCode);
    }

    private Program(Object command, Collection<Class> subcommands) {
        this.cmd = new CommandLine(command);
        for (Class subcommand : subcommands)
            addSubcommand(cmd, subcommand);
    }

    private int execute(String[] args) {
        int exitCode;
        try {
            // TODO: This too naive - what if args is no empty but no commands to run?
            if (args.length == 0)
                cmd.usage(System.out);
            else
                cmd.parseWithHandler(new CommandLine.RunAll(), System.out, args);
            exitCode = 0;
        } catch (Exception e) {
            if (e instanceof CommandLine.ExecutionException && e.getCause() instanceof CliCommandException) {
                CliCommandException cause = (CliCommandException) e.getCause();
                System.out.println(cause.getMessage());
                exitCode = cause.getExitCode();
            } else {
                e.printStackTrace();
                exitCode = 1;
            }
        }
        return exitCode;
    }

    public CommandLine getCmd() {
        return cmd;
    }

    private static void addSubcommand(CommandLine cmd, Class subcommand) {
        try {
            Command command = (Command) subcommand.getAnnotation(Command.class);
            String name = command.name();
            Object instance = subcommand.newInstance();
            cmd.addSubcommand(name, instance);
        } catch (Exception e) {
            System.out.println("Failed to register subcommand for class " + subcommand + ": " + e);
        }
    }

    private static Collection<Class> getSubcommands() {
        // TODO: automate via scanning
        List result = Arrays.asList(DemoCommand.class,
                DeploySpaceCommand.class,
                RunCommand.class,
                ShutdownCommand.class,
                UndeployCommand.class,
                InfoCommand.class,
                UploadResourceCommand.class);
        return result;
    }
}
