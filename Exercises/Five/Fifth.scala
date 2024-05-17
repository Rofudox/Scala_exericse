

import Cards._

object Fifth {
  def main(args: Array[String]): Unit = {
    var deck = Cards.createDeck()
    var (newcard, current_deck) = Cards.newCard(deck)
    deck = current_deck
    println(s"Random card: ${newcard.rank} of ${newcard.suit}")
    println(deck.length)
    while(!deck.isEmpty) {
      newCard(deck)}
      println(s"Random card: ${newcard.rank} of ${newcard.suit}")
  }

  def printCards(card: Card) : Unit = {
    println(s"${card.suit} of ${card.rank}")
  }
}
