package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {

    private Integer xPosition;

    private Integer yPosition;

    private String direction;

    public MarsRover() {
        xPosition = 0;
        yPosition = 0;
        direction = "N";
    }

    public MarsRover(Integer xPosition, Integer yPosition, String direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public void getMarsRoverReport(String commands) {
        Arrays.stream(commands.split("")).forEach(this::executeCommand);
    }

    public void executeCommand(String command){
        switch (command){
            case Command.FORWARD:
                move();
                break;
            case Command.TURN_LEFT:
                turnLeft();
                break;
            case Command.TURN_RIGHT:
                turnRight();
                break;
        }
    }

    private void turnRight() {
        switch (direction){
            case Command.NORTH:
                direction = Command.EAST;
                break;
            case Command.EAST:
                direction = Command.SOUTH;
                break;
            case Command.WEST:
                direction = Command.NORTH;
                break;
            case Command.SOUTH:
                direction = Command.WEST;
                break;
        }
    }

    private void turnLeft() {
        switch (direction){
            case Command.NORTH:
                direction = Command.WEST;
                break;
            case Command.EAST:
                direction = Command.NORTH;
                break;
            case Command.WEST:
                direction = Command.SOUTH;
                break;
            case Command.SOUTH:
                direction = Command.EAST;
                break;

        }
    }

    private void move() {
        switch (direction){
            case Command.NORTH:
                yPosition ++;
                break;
            case Command.EAST:
                xPosition ++;
                break;
            case Command.WEST:
                xPosition --;
                break;
            case Command.SOUTH:
                yPosition --;
                break;
        }
    }

    public Integer getxPosition() {
        return xPosition;
    }

    public Integer getyPosition() {
        return yPosition;
    }

    public String getDirection() {
        return direction;
    }
}
