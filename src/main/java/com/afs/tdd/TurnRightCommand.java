package com.afs.tdd;

/**
 * @author 陈祁天
 * @date 2022/7/21
 * @description 向右
 */
public class TurnRightCommand implements Command{

    private MarsRover marsRover;

    public TurnRightCommand(MarsRover rover) {
        this.marsRover = rover;
    }
    @Override
    public void execute() {
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
