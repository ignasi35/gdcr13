package com.agilogy;

import org.specs2.mutable.Specification;

class GameSpec extends Specification {

  "A Conway's Game Of Life" should {

    "keep three cells alive when had three cells alive and connected" in {
      val game = new Game(3)
      game.nextGenPopulation must equalTo(3)
    }

    "loose all cells when had two cells alive and connected" in {
      val game = new Game(2)
      game.nextGenPopulation must equalTo(0)
    }

    "spawn a dead cell when had three cells alive and one dead and connected" in {
      val game = new Game(3, 1)
      game.nextGenPopulation must equalTo(4)
    }

    "spawn all dead cell when had three cells alive and twenty dead and connected" in {
      val game = new Game(3, 20)
      game.nextGenPopulation must equalTo(23)
    }

  }

  "A RelationalGame" should {

    "get 0 alive cells when had 3 alive unconnected cells" in {

      val aliveness = Map(("1" -> true), ("2" -> true), ("3" -> true))

      new RelationalGame(aliveness, Map()).nextGenPopulation should equalTo(0)
    }

  }

}
