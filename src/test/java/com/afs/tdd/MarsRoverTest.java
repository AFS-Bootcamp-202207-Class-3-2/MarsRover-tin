package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    
    @Test
    void should_go_to_0_1_N_when_getMarsRoverReport_given_0_0_N() {
        //given
        MarsRover rover = new MarsRover(0, 0, "N");

        //when
        rover.getMarsRoverReport("M");
        //then
        assertEquals(0, rover.getxPosition());

        assertEquals(1, rover.getyPosition());

        assertEquals("N", rover.getDirection());
    }
    
}
