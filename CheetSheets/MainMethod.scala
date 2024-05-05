//All method must pass though the main() method.

object MainMethod {
    def main(args: Array[String]) = {
        println("Hello, world")
    }
}

//Not sure yet why, but main might also be create as the following

@main def DifferentMain() =
    println("Hello again")