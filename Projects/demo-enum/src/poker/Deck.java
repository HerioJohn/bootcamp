package poker;

public class Deck {

  private Card[] cards;

  private Deck(int numberOfCards) {
    this.cards = new Card[numberOfCards];
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        this.cards[idx++] = new Card(r, s);
      }
    }

  }
  
  public static Deck pocker() {
    return new Deck(52);
  }

  public static void main(String[] args) {
    Deck deck = Deck.ofPocker();

    deck.overhand();
    deck.overhand();
    deck.overhand();
    deck.overhand();
  }

  public void overhand() {
    
  }

  public void riffle() {

  }
}
