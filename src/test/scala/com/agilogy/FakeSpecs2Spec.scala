package com.agilogy;

import org.specs2.mutable.Specification;
import scala.annotation.tailrec

class CellSpec extends Specification {

  import com.agilogy.LivenessStates._

  "A Cell" should {
    "die when was alive and had one or less neighbours" in {
      val neighbours = cellFactory(0)
      Cell(alive, neighbours).evolve should equalTo(Cell(dead, neighbours))
    }
    "live when was alive and had only two alive neighbour" in {
      val neighbours = cellFactory(2)
      Cell(alive, neighbours).evolve should equalTo(Cell(alive, neighbours))
    }

      def cellFactory(count : Int) : List[Cell] = {
          @tailrec
          def cellFactory0(acc : List[Cell], count : Int) : List[Cell] =
            count match {
              case 0 => acc
              case _ => cellFactory0(Cell(alive, Nil) :: acc, count - 1)
            }
        cellFactory0(Nil, count)
      }
    "die when was alive and had four or more alive neighbours" in {
      val neighbours = cellFactory(5)
      Cell(alive, neighbours).evolve should equalTo(Cell(dead, neighbours))
    }

    "spawn when was dead and had exactyly three neighbours" in {
      val neighbours = cellFactory(3)
      Cell(dead, neighbours).evolve should equalTo(Cell(alive, neighbours))
    }

  }

}
