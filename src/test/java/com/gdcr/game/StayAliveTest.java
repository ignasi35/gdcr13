package com.gdcr.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class StayAliveTest extends RuleTest {
    @Test
    public void testWillAct_WhenCellIsAliveAndHasTwoAliveNeighbours() {
        assertIsActing(true, 2);
    }

    @Test
    public void testWillNotAct_WhenCellIsAliveAndHasFourAliveNeighbours() {
        assertIsNotActing(true, 4);
    }

    @Test
    public void testWillNotAct_WhenCellIsAliveAndHasLessThanTwoAliveNeighbours() {
        assertIsNotActing(true, 1);
    }

    @Test
    public void testWillNotAct_WhenCellIsDead() {
        assertIsNotActing(false, 2);
    }

    @Override
    Rule getRule() {
        return new StayAlive();
    }
}
