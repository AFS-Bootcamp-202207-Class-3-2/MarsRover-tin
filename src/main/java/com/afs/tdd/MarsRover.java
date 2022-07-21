package com.afs.tdd;

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

    public void getMarsRoverReport(String command) {
        switch (command){
            case "M":
                move();
                break;

        }
    }

    private void move() {
        switch (direction){
            case "N":
                yPosition ++;
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
