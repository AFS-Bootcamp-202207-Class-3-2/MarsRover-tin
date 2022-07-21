package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    
    @Test
    void should_go_to_0_1_N_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0,0,CommandConstant.NORTH);
        //then
        rover.getMarsRoverReport(CommandConstant.FORWARD);

        assertEquals(0, rover.getXPosition());

        assertEquals(1, rover.getYPosition());

        assertEquals(CommandConstant.NORTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.NORTH);

        //when
        rover.getMarsRoverReport(CommandConstant.TURN_LEFT);
        //then
        assertEquals(0, rover.getXPosition());

        assertEquals(0, rover.getYPosition());

        assertEquals(CommandConstant.WEST, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.NORTH);

        //when
        rover.getMarsRoverReport(CommandConstant.TURN_RIGHT);
        //then
        assertEquals(0, rover.getXPosition());

        assertEquals(0, rover.getYPosition());

        assertEquals(CommandConstant.EAST, rover.getDirection());
    }

    @Test
    void should_go_to_1_0_E_when_getMarsRoverReport_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.EAST);

        //when
        rover.getMarsRoverReport(CommandConstant.FORWARD);
        //then
        assertEquals(1, rover.getXPosition());

        assertEquals(0, rover.getYPosition());

        assertEquals(CommandConstant.EAST, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_getMarsRoverReport_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.EAST);

        //when
        rover.getMarsRoverReport(CommandConstant.TURN_LEFT);
        //then
        assertEquals(0, rover.getXPosition());

        assertEquals(0, rover.getYPosition());

        assertEquals(CommandConstant.NORTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_getMarsRoverReport_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.EAST);

        //when
        rover.getMarsRoverReport(CommandConstant.TURN_RIGHT);
        //then
        assertEquals(0, rover.getXPosition());

        assertEquals(0, rover.getYPosition());

        assertEquals(CommandConstant.SOUTH, rover.getDirection());
    }

    @Test
    void should_go_to_minus_1_0_W_when_getMarsRoverReport_given_0_0_W() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.WEST);

        //when
        rover.getMarsRoverReport(CommandConstant.FORWARD);
        //then
        assertEquals(-1, rover.getXPosition());

        assertEquals(0, rover.getYPosition());

        assertEquals(CommandConstant.WEST, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_getMarsRoverReport_given_0_0_W() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.WEST);

        //when
        rover.getMarsRoverReport(CommandConstant.TURN_LEFT);
        //then
        assertEquals(0, rover.getXPosition());

        assertEquals(0, rover.getYPosition());

        assertEquals(CommandConstant.SOUTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_getMarsRoverReport_given_0_0_W() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.WEST);

        //when
        rover.getMarsRoverReport(CommandConstant.TURN_RIGHT);
        //then
        assertEquals(0, rover.getXPosition());

        assertEquals(0, rover.getYPosition());

        assertEquals(CommandConstant.NORTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_minus_1_S_when_getMarsRoverReport_given_0_0_S() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.SOUTH);

        //when
        rover.getMarsRoverReport(CommandConstant.FORWARD);
        //then
        assertEquals(0, rover.getXPosition());

        assertEquals(-1, rover.getYPosition());

        assertEquals(CommandConstant.SOUTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_when_getMarsRoverReport_given_0_0_S() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.SOUTH);

        //when
        rover.getMarsRoverReport(CommandConstant.TURN_LEFT);
        //then
        assertEquals(0, rover.getXPosition());

        assertEquals(0, rover.getYPosition());

        assertEquals(CommandConstant.EAST, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_when_getMarsRoverReport_given_0_0_S() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.SOUTH);

        //when
        rover.getMarsRoverReport(CommandConstant.TURN_RIGHT);
        //then
        assertEquals(0, rover.getXPosition());

        assertEquals(0, rover.getYPosition());

        assertEquals(CommandConstant.WEST, rover.getDirection());
    }

    @Test
    void should_go_to_minus_2_0_N_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0, 0, CommandConstant.NORTH);

        //when
        rover.getMarsRoverReport("LMRM");
        //then
        assertEquals(-1, rover.getXPosition());

        assertEquals(1, rover.getYPosition());

        assertEquals(CommandConstant.NORTH, rover.getDirection());
    }
}
