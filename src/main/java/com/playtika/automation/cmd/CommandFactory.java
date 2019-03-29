package com.playtika.automation.cmd;

public class CommandFactory {
    public ConsoleCommand createCommand (String[] command) {
        String commandName = command[0];

        switch (commandName) {
            case "chdir":
                return new ChangeDirCommand(command[1]);
        }
        return null;
    }
}
