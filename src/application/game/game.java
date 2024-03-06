package application.game;

import application.deck.Deck;
import application.deck.PremadeDeck;
import logic.card.BaseCard;

import java.util.ArrayList;

public class game {
    private Enemy boss;

    public void play(){
        this.boss = new Enemy("dd",PremadeDeck.newDeck())
    }
}
