package com.gdcr.game;

import junit.framework.Assert;

import org.junit.Before;

public abstract class RuleTest {
    private Rule r;

    @Before
    public void before() {
        this.r = getRule();
    }

    abstract Rule getRule();

    private void assertAct(boolean alive, int aliveNeighborCount, boolean expected) {
        Assert.assertEquals(expected, r.eval(alive, aliveNeighborCount));
    }

    protected void assertIsActing(boolean alive, int aliveNeighborCount) {
        this.assertAct(alive, aliveNeighborCount, true);
    }

    protected void assertIsNotActing(boolean alive, int aliveNeighborCount) {
        this.assertAct(alive, aliveNeighborCount, false);
    }

}
