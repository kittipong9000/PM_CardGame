package application.deck;

import application.game.Enemy;
import logic.card.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PremadeDeck {
    static ArrayList<BaseCard>  Deck1 = new ArrayList<>();
    public static ArrayList<BaseCard> newDeck() {
        ArrayList<BaseCard> deck = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            deck.add(new AttackCard(Integer.toString(i), 5, 0));
        }
        return deck;
    }
}

