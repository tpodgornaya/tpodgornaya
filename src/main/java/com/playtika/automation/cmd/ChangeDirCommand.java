package com.playtika.automation.cmd;

import java.nio.file.Files;
import java.nio.file.Path;

public class ChangeDirCommand implements ConsoleCommand {
    private final String dir = null;

    public ChangeDirCommand(String s) {
        this.dir = dir;
    }

    @Override
    public void execute(CommandContext context) {
        Path currenPath = context.getPath();
        Path newPath = currenPath.resolve(dir);
        if (Files.isDirectory(newPath)) {
            context.setPath(newPath);
        }
        System.out.println("You're inputted incorrect directory path: " + dir);
    }
}
