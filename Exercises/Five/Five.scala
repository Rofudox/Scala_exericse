
import scala.io.StdIn.readInt
import Monday._
import Tuesday._
import Wednesday._
import Thursday._
import Friday._
import Saturday._
import Sunday._
import Hearts._
import Diamonds._
import Clubs._ 
import Spades._ 
object Five {
  def main(args: Array[String]): Unit = {
    val res1 = Monday.index
    val res2 = Monday.next
    val res3 = Tuesday.n_index
    val res4 = Diamonds.succ.rank
    
    //println("Day nr: " + res1 + " Next day = " + res2)

    println(res4)
  }

  def countDays(day: Weekday): Int = {
    day.index

  }


}
