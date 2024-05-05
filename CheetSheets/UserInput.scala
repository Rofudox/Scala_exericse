//How to import functions and how to take input from user and print it out

import scala.io.StdIn.readLine

@main def UserInput() =
    println("Enter your name")
    val name = readLine()

    println("Hi, " + name + "tits")