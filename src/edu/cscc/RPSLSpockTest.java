package edu.cscc;

import static org.junit.Assert.*;

public class RPSLSpockTest {

    @org.junit.Test
    public void testIsValidPick() {
        assertTrue(RPSLSpock.isValidPick(RPSLSpock.ROCK));
        assertTrue(RPSLSpock.isValidPick(RPSLSpock.PAPER));
        assertTrue(RPSLSpock.isValidPick(RPSLSpock.SCISSORS));
        assertTrue(RPSLSpock.isValidPick(RPSLSpock.LIZARD));
        assertTrue(RPSLSpock.isValidPick(RPSLSpock.SPOCK));
        assertFalse(RPSLSpock.isValidPick("parameter\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"));
    }

    @org.junit.Test
    public void generatePick() {
        for (int i=0; i<1000000; i++) {
            String pick = RPSLSpock.generatePick();
            assertNotNull(pick);
            assertTrue(RPSLSpock.isValidPick(pick));
        }
    }

    @org.junit.Test
    public void isComputerWin() {
        assertFalse(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.PAPER));
        assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SCISSORS));
        assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.LIZARD));
        assertFalse(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SPOCK));

        assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.ROCK));
        assertFalse(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.SCISSORS));
        assertFalse(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.LIZARD));
        assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.SPOCK));

        assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.ROCK));
        assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.PAPER));
        assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.LIZARD));
        assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.SPOCK));

        assertFalse(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.ROCK));
        assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.PAPER));
        assertFalse(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.SCISSORS));
        assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.SPOCK));

        assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.ROCK));
        assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.PAPER));
        assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.SCISSORS));
        assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.LIZARD));
    }
}