import scala.compiletime.ops.double
import scala.io.StdIn.readLine
import scala.util.control.Breaks
import scala.compiletime.ops.string
import scala.compiletime.ops.boolean

object Four {

    def main(args: Array[String]) = {
        //val res = sumRec(5)
        //val res2 = sumRec(1)
        //val res3 = sumRec(0)
        val l1 = List(1,2,3,4,5,8)
        val l2 = List(1.2, 2.3, 0.1)
        val l3 = List()
        val l4 = List(3,4,12,4)
        val res = lastFloat(l2)

        //println(res)
        val res3 = cfrac2float(l4)
        val res2 = mapper(sumRec, 5).toString()
        println(res3)
        //println(res2)
    }

    def fac(n: Int) : Int = {
        if (n == 1) 1
        else n * fac(n-1)
    }

    def pow2(n:Double) : Double = {
        var res = 1
        if (n <= 0) 1
        else math.pow(2.0, n)
    }

    def pow3(n:Double) : Double = {
        var res = 1
        if (n <= 0) 1
        else math.pow(n, n)
    }

    def sumRec(n:Int) : Int = {
        if (n <= 0) 0
        else n + sumRec(n-1)
    }

    def sumList(n:List[Int]) : Int = {
        //basic patternmatching
       n match
        case Nil => 0
        case head :: tail => head + sumList(tail) 
    } 

    def length(n:List[Int]) : Int = {
        var res = 0
        n match
            case Nil => 0
            case head :: tail => (res + 1) + length(tail)
    }

    def lengthAcc(n:List[Int]) : (Int, Int) = {
        return (sumList(n), length(n))
    }

    def gdc(t:Int, n:Int) : Int = {

        (t, n) match
            case (t,0) => t
            case (t,n) => gdc(n,t%n)
    }

    def lastFloat(n:List[Double]) : Double = {
        n match
            case Nil => 0
            case n => n.last
    }

    def mapper(f: Int => Int, n:Int): List[Int] = {
        (0 until n).map(f).toList
    }

    def cfrac2float(lst:List[Int]) : Double = {
        lst match
            case Nil => 0
            case head :: tail => (lst.head + (1/cfrac2float(tail)))
    }


}