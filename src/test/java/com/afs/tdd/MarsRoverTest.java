package com.afs.tdd;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    
    @Test
    void should_go_to_0_1_N_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0,0,CommandConstant.NORTH);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.FORWARD);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //then
        commandInvoke.executeCommands();

        //then
        assertEquals(0, rover.getXPosition());
        assertEquals(1, rover.getYPosition());
        assertEquals(CommandConstant.NORTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.NORTH);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.TURN_LEFT);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals(CommandConstant.WEST, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.NORTH);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.TURN_RIGHT);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals(CommandConstant.EAST, rover.getDirection());
    }

    @Test
    void should_go_to_1_0_E_when_getMarsRoverReport_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.EAST);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.FORWARD);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(1, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals(CommandConstant.EAST, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_getMarsRoverReport_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.EAST);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.TURN_LEFT);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals(CommandConstant.NORTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_getMarsRoverReport_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.EAST);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.TURN_RIGHT);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals(CommandConstant.SOUTH, rover.getDirection());
    }

    @Test
    void should_go_to_minus_1_0_W_when_getMarsRoverReport_given_0_0_W() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.WEST);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.FORWARD);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(-1, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals(CommandConstant.WEST, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_getMarsRoverReport_given_0_0_W() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.WEST);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.TURN_LEFT);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals(CommandConstant.SOUTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_getMarsRoverReport_given_0_0_W() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.WEST);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.TURN_RIGHT);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals(CommandConstant.NORTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_minus_1_S_when_getMarsRoverReport_given_0_0_S() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.SOUTH);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.FORWARD);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(0, rover.getXPosition());
        assertEquals(-1, rover.getYPosition());
        assertEquals(CommandConstant.SOUTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_when_getMarsRoverReport_given_0_0_S() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.SOUTH);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.TURN_LEFT);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals(CommandConstant.EAST, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_when_getMarsRoverReport_given_0_0_S() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.SOUTH);
        List<Command> commandList = ConvertCommand.getConvertList(rover, CommandConstant.TURN_RIGHT);
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(0, rover.getXPosition());
        assertEquals(0, rover.getYPosition());
        assertEquals(CommandConstant.WEST, rover.getDirection());
    }

    @Test
    void should_go_to_minus_2_0_N_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.NORTH);
        List<Command> commandList = ConvertCommand.getConvertList(rover, "MLMR");
        CommandInvoke commandInvoke = new CommandInvoke(commandList);

        //when
        commandInvoke.executeCommands();

        //then
        assertEquals(-1, rover.getXPosition());
        assertEquals(1, rover.getYPosition());
        assertEquals(CommandConstant.NORTH, rover.getDirection());
    }
}
