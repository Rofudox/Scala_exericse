

import Cards._

object Fifth {
  def main(args: Array[String]): Unit = {
    val deck = Cards.createDeck()
    println(deck.length)

    //deck.foreach(printCards)

  }

  def printCards(card: Card) : Unit = {
    println(s"${card.suit} of ${card.rank}")
  }
}
