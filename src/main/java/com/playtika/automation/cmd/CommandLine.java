package com.playtika.automation.cmd;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CommandLine {
    private static Pattern SPLITTER = Pattern.compile("\\s");
    private CommandContext commandContext;
    private CommandFactory commandFactory;

    public CommandLine() {
        commandContext = new CommandContext();
        commandFactory = new CommandFactory();
    }

    public void run() {
        boolean working = true;
        Scanner console = new Scanner(System.in);
        while(commandContext.isWorking()) {
            System.out.printf("$%s> ", commandContext.getPath().toAbsolutePath());
            String line = console.nextLine();
            String[] command = SPLITTER.split(line);
            ConsoleCommand consoleCommand = commandFactory.createCommand(command);
            consoleCommand.execute(commandContext);
        }

    }

    public static void main(String[] args) {
        CommandLine cmd = new CommandLine();
        cmd.run();
    }
}
