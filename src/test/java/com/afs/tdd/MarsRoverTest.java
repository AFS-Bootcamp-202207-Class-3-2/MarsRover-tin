package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    
    @Test
    void should_go_to_0_1_N_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0, 0, Command.NORTH);

        //when
        rover.getMarsRoverReport(Command.FORWARD);
        //then
        assertEquals(0, rover.getxPosition());

        assertEquals(1, rover.getyPosition());

        assertEquals(Command.NORTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0, 0, Command.NORTH);

        //when
        rover.getMarsRoverReport(Command.TURN_LEFT);
        //then
        assertEquals(0, rover.getxPosition());

        assertEquals(0, rover.getyPosition());

        assertEquals(Command.WEST, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0, 0, Command.NORTH);

        //when
        rover.getMarsRoverReport(Command.TURN_RIGHT);
        //then
        assertEquals(0, rover.getxPosition());

        assertEquals(0, rover.getyPosition());

        assertEquals(Command.EAST, rover.getDirection());
    }

    @Test
    void should_go_to_1_0_E_when_getMarsRoverReport_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0, 0, Command.EAST);

        //when
        rover.getMarsRoverReport(Command.FORWARD);
        //then
        assertEquals(1, rover.getxPosition());

        assertEquals(0, rover.getyPosition());

        assertEquals(Command.EAST, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_getMarsRoverReport_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0, 0, Command.EAST);

        //when
        rover.getMarsRoverReport(Command.TURN_LEFT);
        //then
        assertEquals(0, rover.getxPosition());

        assertEquals(0, rover.getyPosition());

        assertEquals(Command.NORTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_getMarsRoverReport_given_0_0_E() {
        //given
        MarsRover rover = new MarsRover(0, 0, Command.EAST);

        //when
        rover.getMarsRoverReport(Command.TURN_RIGHT);
        //then
        assertEquals(0, rover.getxPosition());

        assertEquals(0, rover.getyPosition());

        assertEquals(Command.SOUTH, rover.getDirection());
    }

    @Test
    void should_go_to_minus_1_0_W_when_getMarsRoverReport_given_0_0_W() {
        //given
        MarsRover rover = new MarsRover(0, 0, Command.WEST);

        //when
        rover.getMarsRoverReport(Command.FORWARD);
        //then
        assertEquals(-1, rover.getxPosition());

        assertEquals(0, rover.getyPosition());

        assertEquals(Command.WEST, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_when_getMarsRoverReport_given_0_0_W() {
        //given
        MarsRover rover = new MarsRover(0, 0, Command.WEST);

        //when
        rover.getMarsRoverReport(Command.TURN_LEFT);
        //then
        assertEquals(0, rover.getxPosition());

        assertEquals(0, rover.getyPosition());

        assertEquals(Command.SOUTH, rover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_when_getMarsRoverReport_given_0_0_W() {
        //given
        MarsRover rover = new MarsRover(0, 0, Command.WEST);

        //when
        rover.getMarsRoverReport(Command.TURN_RIGHT);
        //then
        assertEquals(0, rover.getxPosition());

        assertEquals(0, rover.getyPosition());

        assertEquals(Command.NORTH, rover.getDirection());
    }
}
