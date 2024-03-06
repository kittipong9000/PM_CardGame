package application.deck;

import application.game.Enemy;
import logic.card.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PremadeDeck {
    ArrayList<BaseCard>  Deck1 = new ArrayList<>();


    public ArrayList<BaseCard> newDack(){
        Deck1.add(new AttackCard("A",5,0));
        return Deck1;
    }
}

