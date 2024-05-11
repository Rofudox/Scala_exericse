import scala.io.StdIn.readLine
import scala.util.control.Breaks
import scala.compiletime.ops.string
import scala.compiletime.ops.boolean
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
        //lFunctions(3.5)
        //squares(5)
        //val res = Array(1,2,3,4,5)
        
        /* 

        val emptylist = List()
        println(isTable(list,list))
        println(isTable(list,l2))
        println(isTable(emptylist,emptylist))
        //println(reverseArray(res).mkString(", "))
         */
        val list = List(1,2,3,4,5)
        val l2 = List(8,2,3)
        val l3 = List(
            List(1,2,3),
            List(4,5,6),
            //List(6,7,8)
        )
        val a1 = Array(
            Array(1,2,3),
            Array(4,5,6)
        )
        //firstColum(List(list,l2))
        //dropCol(List(list, l2))
        //println(a1.mkString(", "))
       
        val Ta1 = transposeArr(a1)
        println(a1.foreach(row => println(row.mkString(", "))))
        println("")
        Ta1.foreach(row => println(row.mkString(", ")))
        
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

    def squares(n:Int) : Array[Double] = {
        val res = new Array[Double](n+1)
        for (i <- 0 until n+1) {
            println(res(i))//Prints 0
            res(i) = i * i
            println("lol " + res(i))//Prints values
        }
        res
    }

    def reverseArray(n:Array[Int]) : Array[Int] = {
        val res = n.reverse
        res
    }

    def isTable(n:List[Int], k:List[Int]) : Boolean = {
        val a = true
        val b = false
        if(n.length != k.length) {
            return b
        }
        else return a
    }
    
    def firstColum(n:List[List[Int]]) :List[Int] = {

        val res = n.map(_.headOption.getOrElse(0))
        //val dres = n.map(_.tail)
        //println(dres)
        println(res)
        return res
    }

    def dropCol(n:List[List[Int]]) :List[List[Int]] = {
        val dres = n.map(_.tail)
        println(dres)
        return dres
    }

    def transpose(n:List[List[Int]]) : List[List[Int]] = {

        val res = n.transpose
        res
    }

    def transposeArr(n:Array[Array[Int]]) : Array[Array[Int]] = {

        val res = n.transpose
        res
    }

}