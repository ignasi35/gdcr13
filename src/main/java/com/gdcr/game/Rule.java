package com.gdcr.game;

public interface Rule {

    boolean eval(boolean alive, int aliveNeighborCount);

}
