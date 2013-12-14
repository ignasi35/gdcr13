package com.agilogy

sealed trait Liveness
object LivenessStates {
  def dead = Dead()
  def alive = Alive()
  case class Alive() extends Liveness
  case class Dead() extends Liveness
}

case class Cell(aliveness : Liveness, neighbours : List[Cell]) {
  import com.agilogy.LivenessStates._
  def evolve = (aliveness, neighbours.filter(_.aliveness == alive).size) match {
    case (alive, i) if (i <= 1) => Cell(dead, neighbours)
    case (alive, 2)             => Cell(alive, neighbours)
    case (alive, i) if (i >= 4) => Cell(dead, neighbours)
    case (dead, 3)              => Cell(alive, neighbours)
  }

}