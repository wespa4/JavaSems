package practice2.task9;
import java.util.Random;

public class Deck {
    private Card[] cards;
    private int numCards;

    public Deck() {
        cards = new Card[52];
        numCards = 0;
        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};
        String[] ranks = {"Туз", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король"};
        for (String suit : suits) {
            for (String rank : ranks) {
                cards[numCards] = new Card(suit, rank);
                numCards++;
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = numCards - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card dealCard() {
        if (numCards == 0) {
            return null;
        }
        numCards--;
        return cards[numCards];
    }
}