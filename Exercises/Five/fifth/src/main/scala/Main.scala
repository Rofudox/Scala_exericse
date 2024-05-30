import Cards.*
import Drones.*

import scala.math.*
import scala.util.Random
//import scala.compiletime.ops.float
@main def hello(): Unit = {
    val myList = List(1.0f, 2.0f, 3.0f, 4.0f, 5.0f)
    println(poly(myList))
    
  }


def poly(a : List[Float]) : Float = {
  var sum : Float = 0.0f
  for ((k, index) <- a.zipWithIndex)  {
    sum += math.pow(k, index).toFloat
    println(k + "^" + " " + index + " = " + sum)
  }
  sum
}