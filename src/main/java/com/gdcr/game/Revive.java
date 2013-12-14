package com.gdcr.game;

public class Revive implements Rule {

    @Override
    public boolean eval(boolean alive, int aliveNeighborCount) {
        return !alive && aliveNeighborCount == 3;
    }

}
