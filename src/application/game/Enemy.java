package application.game;

import logic.card.BaseCard;
import logic.player.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class Enemy extends Player {
    private String name;
    public Enemy() {
        this("Enemy", new ArrayList<>());
    }
    public Enemy(String name, ArrayList<BaseCard> deck) {
        this.setName(name);
        this.setDeck(deck);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

