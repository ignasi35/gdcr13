package com.agilogy;

import org.specs2.mutable.Specification;

class GameSpec extends Specification {

  val dead = false
  val alive = true

  "A Cell" should {

      def cellAssertion(before : Boolean, neighCount : Int, after : Boolean) =
        new Cell(before, neighCount).nextGen.isAlive should equalTo(after)

    "die when it's alive and has one or less neighbors" in {
      cellAssertion(alive, 1, dead)
    }
    "live when it's alive and has two or three neighbors" in {
      cellAssertion(alive, 2, alive)
    }
    "die when it's alive and has more than three neighbors" in {
      cellAssertion(alive, 4, dead)
    }
    "spawn when it's dead and has exactly three neighbors" in {
      cellAssertion(dead, 3, alive)
    }

  }

  "A World" should {

    "update a cell state when a cell state is changed" in {
      val w = new World()
      val cell = Cell(alive, 0)
      w.put((3, 3), cell)

    }

  }

}
