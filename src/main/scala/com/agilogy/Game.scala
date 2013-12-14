package com.agilogy

class World

class Cell(var isAlive : Boolean, aliveNeighbourCount : Int) {

  def nextGen() : Cell = {
    (isAlive, aliveNeighbourCount) match {
      case (true, i) if (i <= 1) => isAlive = false
      case (true, i) if (i <= 3) => isAlive = true
      case (true, _)             => isAlive = false
      case (false, 3)            => isAlive = true
    }
    this
  }

}