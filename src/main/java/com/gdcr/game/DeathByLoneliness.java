package com.gdcr.game;

public class DeathByLoneliness implements Rule {

    @Override
    public boolean eval(boolean alive, int aliveNeighborCount) {
        return alive && aliveNeighborCount <= 1;
    }

}
