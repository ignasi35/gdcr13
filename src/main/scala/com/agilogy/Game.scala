package com.agilogy

/**
 * @param count number of cells alive. All cells are connected
 */
class Game(countOfAliveCells : Int, countOfDeadCells : Int = 0) {

  def nextGenPopulation = {
    countOfAliveCells match {
      case 3 => countOfAliveCells + countOfDeadCells
      case _ => 0
    }
  }

}

class RelationalGame(aliveness : Map[String, Boolean],
                     relations : Map[String, Set[String]]) {

  def nextGenPopulation() : Int = 0

}