package com.gdcr.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeathByOverPopulationTest extends RuleTest {
    @Test
    public void testWillAct_WhenCellIsAliveAndHasFourAliveNeighbors() {
        assertIsActing(true, 4);
    }

    @Override
    Rule getRule() {
        return new DeathByOverPopulation();
    }

}
