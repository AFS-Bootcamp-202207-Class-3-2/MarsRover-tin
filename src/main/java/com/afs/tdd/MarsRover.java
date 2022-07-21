package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {

    private int xPosition;
    private int yPosition;
    private String direction;

    public MarsRover(int xPosition, int yPosition, String direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void getMarsRoverReport(String commands){
        Arrays.stream(commands.split("")).forEach(command -> checkCommand(this,command));
    }

    public void checkCommand(MarsRover marsRover, String command){
        if(command.equals(CommandConstant.FORWARD)){
            new Request(new ForwardCommand(marsRover)).executeCommand();
            return;
        }
        if(command.equals(CommandConstant.TURN_LEFT)){
            new Request(new TurnLeftCommand(marsRover)).executeCommand();
            return;
        }
        new Request(new TurnRightCommand(marsRover)).executeCommand();

    }
}

