package practice2.task9;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = input.nextInt();
        Deck deck = new Deck();
        deck.shuffle();
        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                Card card = deck.dealCard();
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
