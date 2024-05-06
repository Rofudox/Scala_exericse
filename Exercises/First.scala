import scala.io.StdIn.readInt
object First {
    def main(args: Array[String]) = {

        sum2()
    }
    
    def calc() = {
        val a: Int = 3
        val b: Int = 4
        val x: Int = 5
        val sum: Int = a * x + b
        
        println(("a * x + b = " ) + sum )

    }

    def names() = {
        val firstName: String = "Anthon"
        val lastName: String = "Sofid"

        println("Firstname " + firstName + "Lastname" + lastName)
    }

    def loopCalc() = {
        val a = 3
        val b = 4
        var x = 5

        for (i <- 0 to x ) {
            println("a * x + b = " + (a*i+b))
        }
    }

    def whileCalc() = {
        var x = 0
        while(x < 5) {
            println("a * x2 + b = " + (3 * x + 4))
            x = x + 1
        }
    }

    def fac() = {
        
        var n = readInt()
        var sum = 1
        while(n > 1) {
            sum = (sum * n)
            n = (n - 1)
            
        }
        println("sum = " + sum)
        
    }

    def sum() = {
        val count = 10
        var n = readInt()

        //var n = 1
        while(n < count) {
            if (n == 0) {
                println("0")
            }
            println("When n is " + n)
            println(((n*(n+1))/2))
            n = n + 1
        }
    }

    def sum2() = {
        var n = readInt()
        var d2Array: Array[Array[Int]] = Array.ofDim[Int](2,5)
        d2Array(0) = Array(1,2,3,4,5)
        d2Array(1) = Array(2,3,4,5,6)
        for(i <- 0 until 2) {
            for (j <- 0 until d2Array(i).length) {
                
                d2Array(i)(j) = (i+n)*(j+n)
                print(d2Array(i)(j) + " ")
            }
            println()
            
        }
    }
}