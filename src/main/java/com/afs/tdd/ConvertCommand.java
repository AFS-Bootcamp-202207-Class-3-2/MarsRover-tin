package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 陈祁天
 * @date 2022/7/24
 * @description
 */
public class ConvertCommand {


    public static Command convertInstruction(MarsRover rover, String instruction){
        if(instruction.equals(CommandConstant.FORWARD)){
            return new ForwardCommand(rover);
        }
        if(instruction.equals(CommandConstant.TURN_LEFT)){
            return new TurnLeftCommand(rover);
        }
        return new TurnRightCommand(rover);
    }


    public static List<Command> getConvertList(MarsRover rover,String instructions){
        ArrayList<Command> commands = new ArrayList<>();
        Arrays.stream(instructions.split(""))
                .forEach(instruction -> commands.add(convertInstruction(rover,instruction)));
        return commands;
    }

}
