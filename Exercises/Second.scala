import scala.compiletime.ops.double

object Second {
    def main(args: Array[String]) = {

        //color()
        //print(gray(232, 22, 123)*1.5)
        val v1 = squrt(3, 5)
        val v2 = squrt(5, 6)
        println(v1 + v2)
        println(lenAtan(12,12))
        
    }

    def color() = {
        var r = 3
        var g = 4
        var b = 5
        var c = (r, g, b)
        var arr = Array(3)
        var v2 = (trunc(r , g) , trunc(g , b) , (trunc(b , r)))
        
        println(v2)
        
    }
    def trunc(c1 :Int, c2 :Int): Int = {
        var v1 = c1 + c2
        return v1       
    }

    def gray(r: Int, g: Int, b:Int) : Int = {
    
        var v = ((r + g + b)/3)
        if (v < 0) {
            return 0
        }
        else if (v > 255) {
            return 255
        }
        else return v
    }

    def vectors() = {
         
    }

    def squrt(a:Int, b:Int) : Double = {
        var v = math.sqrt(math.pow(a, b))
        return v
    }

    def lenAtan(x: Int, y:Int) : Double = {
        var an = math.atan2(x,y)
        return an
    }
}