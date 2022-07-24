package com.afs.tdd;


/**
 * @author 陈祁天
 * @date 2022/7/21
 * @description 向前
 */
public class ForwardCommand implements Command{

    private MarsRover marsRover;

    public ForwardCommand(MarsRover rover) {
        this.marsRover = rover;
    }

    @Override
    public void execute() {
        switch (marsRover.getDirection()){
            case CommandConstant.NORTH:
                marsRover.setYPosition(marsRover.getYPosition() + 1);
                break;
            case CommandConstant.EAST:
                marsRover.setXPosition(marsRover.getXPosition() + 1);
                break;
            case CommandConstant.WEST:
                marsRover.setXPosition(marsRover.getXPosition() - 1);
                break;
            case CommandConstant.SOUTH:
                marsRover.setYPosition(marsRover.getYPosition() - 1);
                break;
        }
    }
}
