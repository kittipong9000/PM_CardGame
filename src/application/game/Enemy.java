package application.game;

import logic.card.BaseCard;
import logic.player.Player;

import java.util.ArrayList;

public class Enemy extends Player {
    private String name;

    public Enemy() {
        this("Enemy", new ArrayList<>());
    }

    public Enemy(String name, ArrayList<BaseCard> deck) {
        super(deck);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playCard() {
        if (!this.getHand().isEmpty()) {
            BaseCard cardToPlay = this.getHand().get(0).play(gameIo.getPlayer());
            this.getHand().remove(0);
        }
    }
}
