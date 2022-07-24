package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Invoke 调用者
 */
public class CommandInvoke {

    private List<Command> commands = new ArrayList<>();

    //接受者
    private MarsRover marsRover;

    public CommandInvoke(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public void getMarsRoverReport(String instructions){
        Arrays.stream(instructions.split(""))
                .forEach(instruction -> commands.add(convertCommand(instruction)));
        commands.stream()
                .forEach(command -> command.execute(marsRover));
    }

    public Command convertCommand(String instruction){
        if(instruction.equals(CommandConstant.FORWARD)){
            return new ForwardCommand();
        }
        if(instruction.equals(CommandConstant.TURN_LEFT)){
            return new TurnLeftCommand();
        }
        return new TurnRightCommand();
    }

}
