package com.gdcr.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeathByLonelinessTest extends RuleTest {
    @Test
    public void testWillAct_WhenCellIsAliveAndHasZeroAliveNeighbors() {
        assertIsActing(true, 0);
    }

    @Test
    public void testWillNotAct_WhenCellIsAliveAndHasTwoAliveNeighbours() {
        assertIsNotActing(true, 2);
    }

    @Test
    public void testWillNotAct_WhenCellIsDead() {
        assertIsNotActing(false, 1);
    }

    @Override
    Rule getRule() {
        return new DeathByLoneliness();
    }

}
