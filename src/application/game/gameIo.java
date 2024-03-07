package application.game;
import application.game.*;
import application.deck.PremadeDeck;
import logic.player.Player;

public class gameIo {
    private Enemy boss;
    private Player player;
    public void start(){
        this.boss = new Enemy("Boss", PremadeDeck.newDeck());
        this.player = new Player();
    }

    public void update(){
        this.boss = new Enemy("Boss", PremadeDeck.newDeck());
        this.boss.playCard();
    }

    public static Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
