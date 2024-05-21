
import scala.util.Random
sealed trait Suit
case object Hearts extends Suit
case object Diamonds extends Suit
case object Clubs extends Suit
case object Spades extends Suit

sealed trait Rank {
  def value: Int
}
case object Two extends Rank { val value = 2}
case object Three extends Rank { val value = 3}
case object Four extends Rank {val value = 4}
case object Five extends Rank {val value = 5}
case object Six extends Rank {val value = 6}
case object Seven extends Rank {val value = 7}
case object Eight extends Rank {val value = 8}
case object Nine extends Rank {val value = 9}
case object Ten extends Rank {val value = 10}
case object Jack extends Rank {val value = 11}
case object Queen extends Rank {val value = 12}
case object King extends Rank {val value = 13}
case object Ace extends Rank {val value = 14}

case class Card(rank: Rank, suit: Suit)

object Cards {

def createDeck(): List[Card] = {
    val ranks = List(Two, Three, Four, Five, Six, Seven, 
      Eight, Nine, Ten, Jack, Queen, King, Ace)
    val suits = List(Hearts, Diamonds, Clubs, Spades)
    for {
      rank <- ranks
      suit <- suits
    } yield Card(rank, suit)
  }

  def newCard(deck: List[Card]): (Card, List[Card]) = {
    val randomCard = Random.nextInt(deck.length)
    val card = deck(randomCard)
    val curr_deck = deck.patch(randomCard, Nil, 1)
    (card, curr_deck)
  }

  def compareCard(card1: Card, card2: Card): Int = {
    card1.rank.value.compareTo(card2.rank.value)
  }
}