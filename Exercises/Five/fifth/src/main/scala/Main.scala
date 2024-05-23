import Cards.*

import scala.util.Random

@main def hello(): Unit = {
    var (player1, player2) = dealCards()
    println("Player1: ")
    player1.foreach(printCard)
    println(" ")
    println("Player2: ")
    player2.foreach(printCard)
    playCards()

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