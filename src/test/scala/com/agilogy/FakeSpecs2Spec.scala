package com.agilogy;

import org.specs2.mutable.Specification;

class CellSpec extends Specification {

  import com.agilogy.LivenessStates._

  "A Cell" should {
    "die when was alive and had no neighbours" in {
      val neighbours = List[Cell]()
      Cell(alive, neighbours).evolve should equalTo(Cell(dead, neighbours))
    }
    "live when was alive and had only two alive neighbour" in {
      val neighbours = List[Cell](Cell(alive, Nil), Cell(alive, Nil))
      Cell(alive, neighbours).evolve should equalTo(Cell(alive, neighbours))
    }

      def cellFactory = Cell(alive, Nil)

    "die when was alive and had four or more alive neighbours" in {
      val neighbours = List[Cell](cellFactory, cellFactory, cellFactory, cellFactory, cellFactory)
      Cell(alive, neighbours).evolve should equalTo(Cell(dead, neighbours))
    }
  }

}
