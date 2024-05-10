import scala.io.StdIn.readLine
import scala.util.control.Breaks
import scala.compiletime.ops.string
object Third {

    def main(args: Array[String]) = {
        /*
        oneToN(2)
        twoTon(10)
        listMap(2)
        listMap(3)
        Slist()
        */
        //val res = even()
        //println(s"Reust is: $res")
        //println(even())
        //intFilter()
        //intCount(5)
        //rev()
        lFunctions(3.5)
    }

    def oneToN(n:Int) = {

        val nonEmpty = (0 until n+1).toList
        println(nonEmpty)
    }

    def twoTon(n:Int) = {
        var notEmpty: List[Int] = Nil

        for (i <- 0 until n+1) {
            notEmpty = i :: notEmpty
        }
        println(notEmpty.reverse)
    }

    def listMap(n:Double) = {
        val l1 = List(1, 2, 3, 4, 5, 6)
        val res = l1.map(x => x/n)
        println(res)
    }

    def Slist() = {
        println("Provide input ")
        var input = ""
        while (input != "End") {
            val input = readLine()
            if (input == "End") {
                print("Ended")
                Breaks.break
            }
            else if (input != "End") {
            val stringList = input.split("\\s+ ").toList
            stringList.foreach(print)
            }
            println("")
        }
    }

    def even() : Boolean =  {
        println("Provide input")
        var input = readLine()
        val isEven = input.length % 2 == 0

        isEven
    }

    def intFilter() = {
        val l1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

        val res = l1.filter(_ % 2 == 0)
        println(res)
    }

    def intCount(n:Int) = {
        val l1 = List(1, 2, 3, 4, 5, 6, 7, 8, 5, 5, 9, 0)
        var l2 : List[Int] = Nil
        l2 = l1.filter(_ == n)
        println(l2.length)
    }

    def rev() = {
        val l1 = List(1, 2, 3, 4, 5, 6, 7, 8, 5, 5, 9, 0)
        val l2 = l1.fold(0)((x, y) => y + x)
        val l3 = l1.reverse
        println(l1)
        println(l2)
        println(l3)
    }

    def lFunctions(n:Double) = {
        val sin = math.sin(n)
        val cos = math.cos(n)
        val log = math.log(n)
        val exp = math.pow(2, n)
        val l1 = List(cos, sin, log, exp)
        println(l1)
    }
}