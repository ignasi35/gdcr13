package com.gdcr.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReviveTest extends RuleTest {
    @Test
    public void testWillAct_WhenCellIsDeadAndHasExactlyThreeAliveNeighbours() {
        assertIsActing(false, 3);
    }

    @Test
    public void testWillNotAct_WhenCellIsDeadAndHasTwoAliveNeighbours() {
        assertIsNotActing(false, 2);
    }

    @Test
    public void testWillNotAct_WhenCellIsDeadAndHasFourAliveNeighbours() {
        assertIsNotActing(false, 4);
    }

    @Test
    public void testWillNotAct_WhenCellIsAlive() {
        assertIsNotActing(true, 1);
        assertIsNotActing(true, 3);
        assertIsNotActing(true, 5);
    }

    @Override
    Rule getRule() {
        return new Revive();
    }
}
