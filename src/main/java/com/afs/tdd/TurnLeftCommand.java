package com.afs.tdd;

/**
 * @author 陈祁天
 * @date 2022/7/21
 * @description 向左
 */
public class TurnLeftCommand implements Command{

    private MarsRover marsRover;

    public TurnLeftCommand(MarsRover rover) {
        this.marsRover = rover;
    }


    @Override
    public void execute() {
        switch (marsRover.getDirection()) {
            case CommandConstant.NORTH:
                marsRover.setDirection(CommandConstant.WEST);
                break;
            case CommandConstant.EAST:
                marsRover.setDirection(CommandConstant.NORTH);
                break;
            case CommandConstant.WEST:
                marsRover.setDirection(CommandConstant.SOUTH);
                break;
            case CommandConstant.SOUTH:
                marsRover.setDirection(CommandConstant.EAST);
                break;
        }
    }
}
