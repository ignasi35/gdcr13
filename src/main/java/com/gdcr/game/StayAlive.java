package com.gdcr.game;

public class StayAlive implements Rule {

    @Override
    public boolean eval(boolean alive, int aliveNeighborCount) {
        return alive && aliveNeighborCount < 4 && aliveNeighborCount > 1;
    }

}
