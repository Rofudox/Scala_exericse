
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
case object Ace extends Rank {val value = 1}

case class Card(rank: Rank, suit: Suit)

object Cards {

def createDeck(): List[Card] = {
    val ranks = List(Two, Three, Four, Five, Six, Seven,
      Eight, Nine, Ten, Jack, Queen, King, Ace)
    val suits = List(Hearts, Diamonds, Clubs, Spades)
    val deck = for {
      rank <- ranks
      suit <- suits
    } yield Card(rank, suit)
    deck
}

  def compareCard(card1: Card, card2: Card): Int = {
    card1.rank.value.compareTo(card2.rank.value)
  }
}

def playCards() : Unit = {

  var (player1, player2) = dealCards()

    while(player1.nonEmpty && player2.nonEmpty) {
      val (card1, curr_player1_deck) = (player1.head, player1.tail)
      val (card2, curr_player2_deck) = (player2.head, player2.tail)
      val comparison = Cards.compareCard(card1, card2)
      comparison match {
      case 1 =>
        println(s"${printCard(card1)} wins against ${printCard(card2)}")
        player1 = curr_player1_deck :+ card1 :+ card2
        player2 = curr_player2_deck
      case -1 =>
        println(s"${printCard(card2)} wins against ${printCard(card1)}")
        player1 = curr_player1_deck
        player2 = curr_player2_deck :+ card1 :+ card2
        
      case 0 =>
        println(s"${printCard(card1)} ties with ${printCard(card2)}")
        player1 = curr_player1_deck :+ card1
        player2 = curr_player2_deck :+ card2
      }
      println(s"Player 1 has ${player1.length} cards.")
      println(s"Player 2 has ${player2.length} cards.")
    }
    if (player1.isEmpty) println("Player 2 wins!")
    if (player2.isEmpty) println("Player 1 wins!")
}

def printCard(card: Card): String = {
  val card_to_String = s"${card.rank} of ${card.suit}"
  
  card_to_String
}

def dealCards(): (List[Card], List[Card]) = {
  var deck = Random.shuffle(Cards.createDeck())
  for (_ <- 1 to 155) {
    deck = Random.shuffle(deck)
  }
  val (player1, player2) = deck.splitAt(deck.length / 2)

  (player1, player2)
}