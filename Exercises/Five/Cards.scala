sealed trait Cards {
    def suit: Unit
    def rank: Unit
    def card: Unit = s"$rank of $suit"
}

object Hearts extends Cards {
    def succ = Diamonds
    val suit = (0 until 14)
    val rank = (0 until 14)
}

object Diamonds extends Cards {
    def succ = Clubs
    val suit = (0 until 14)
    val rank = (0 until 14)
}

object Clubs extends Cards {
    def succ = Spades
    val suit = (0 until 14)
    val rank = (0 until 14)
}
object Spades extends Cards {
    def succ = Nil
    val suit = (0 until 14)
    val rank = (0 until 14)
}