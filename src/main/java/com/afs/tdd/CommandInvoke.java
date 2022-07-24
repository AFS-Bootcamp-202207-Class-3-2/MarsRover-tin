package com.afs.tdd;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoke {

    private List<Command> commands;

    public CommandInvoke(List<Command> commands) {
        this.commands = commands;
    }

    public void executeCommands(){
        commands.stream()
                .forEach(command -> command.execute());
    }



}
