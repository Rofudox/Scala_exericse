object Third {

    def main(args: Array[String]) = {
        oneToN(2)
        twoTon(10)
        listMap(2)
        listMap(3)


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
}