package com.afs.tdd;

/**
 * @author 陈祁天
 * @date 2022/7/21
 * @description 向右
 */
public class TurnRightCommand implements Command{

    @Override
    public void execute(MarsRover marsRover) {
        switch (marsRover.getDirection()){
            case CommandConstant.NORTH:
                marsRover.setDirection(CommandConstant.EAST);
                break;
            case CommandConstant.EAST:
                marsRover.setDirection(CommandConstant.SOUTH);
                break;
            case CommandConstant.WEST:
                marsRover.setDirection(CommandConstant.NORTH);
                break;
            case CommandConstant.SOUTH:
                marsRover.setDirection(CommandConstant.WEST);
                break;
        }
    }
}
