
import scala.util.Random
import Cards._

object Fifth {
  private var deck : List[Card] = Cards.createDeck()

  def main(args: Array[String]): Unit = {
    deck = Random.shuffle(deck)
    var player1 : List[Card] = List.empty
    var player2 : List[Card] = List.empty

    while (deck.length > 2) {
      val (card1, deck_1) = Cards.newCard(deck)
      deck = deck_1
      val (card2, deck_2) = Cards.newCard(deck)
      deck = deck_2
      val comparison = Cards.compareCard(card1, card2)
      if (comparison > 0) {
        println(s"${card1.rank} of ${card1.suit} is greater than ${card2.rank} of ${card2.suit}")
        player1 = card1 :: player1
        player1 = card2 :: player1
      } else if (comparison < 0) {
        println(s"${card1.rank} of ${card1.suit} is less than ${card2.rank} of ${card2.suit}")
        player2 = card1 :: player2
        player2 = card2 :: player2
      } else {
        println(s"${card1.rank} of ${card1.suit} is equal to ${card2.rank} of ${card2.suit}")
      }
      println(s"Remaining deck size: ${deck.length}")
      println(player1.length)
      println(player2.length)
    }
  }

  def printCards(card: Card) : Unit = {
    println(s"${card.suit} of ${card.rank}")
  }

  def getNextCard(): Card = {
    if (deck.isEmpty) {
      throw new NoSuchElementException("No more Cards")
    }
    val card = deck.head
    deck = deck.tail
    card
  }
}
