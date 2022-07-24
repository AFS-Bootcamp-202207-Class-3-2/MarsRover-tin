package com.afs.tdd;

/**
 * @author 陈祁天
 * @date 2022/7/21
 * @description 向左
 */
public class TurnLeftCommand implements Command{

    @Override
    public void execute(MarsRover marsRover) {
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
