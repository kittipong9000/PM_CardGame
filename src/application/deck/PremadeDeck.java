package application.deck;

import application.game.Enemy;
import logic.card.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PremadeDeck {
    public static ArrayList<BaseCard> newDeck() {
        ArrayList<BaseCard> deck = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int power = random.nextInt(10) + 1; // สุ่มค่าพลังโจมตีในช่วง 1-10
            int cost = random.nextInt(2); // สุ่มค่าต้นทุนในช่วง 0-4
            deck.add(new AttackCard(Integer.toString(i), power, cost));
        }
        return deck;
    }
}
