package application.game;
import application.game.*;
import application.deck.PremadeDeck;
import logic.card.BaseCard;
import logic.player.Player;

import java.util.Scanner;

public class gameIo {
    private Enemy boss;
    private Player player;
    private Scanner scanner;

    public gameIo() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        this.boss = new Enemy("Boss", PremadeDeck.newDeck());
        this.player = new Player(PremadeDeck.newDeck());
    }

    public void updateGame() {
        this.boss.playCard();
        System.out.println("Boss play");
        this.player.setHandForStart();
        System.out.println( "Player HP : "+ this.getPlayer().getDeck().size());
        System.out.println( "BOSS HP : "+ this.getPlayer().getDeck().size());
    }

    public void playerPlay() {
        System.out.println("You Card : ");
        for(int i=0;i<this.player.getHand().size();i++){
            System.out.println((i+1) + " "+ this.getPlayer().getDeck().get(i).getName());
        }

        System.out.println("Select a card to play : ");
        int cardIndex = scanner.nextInt();
        // เลือกการ์ดที่ผู้เล่นต้องการจะเล่นจากมือของผู้เล่น
        BaseCard selectedCard = player.getHand().get(cardIndex - 1);

        // เล่นการ์ดที่เลือก
        // ในที่นี้ยังไม่ได้กำหนดว่าจะทำอะไรเมื่อผู้เล่นเลือกการ์ด คุณสามารถปรับแก้ตามความต้องการของเกมได้
    }

    public boolean isGameOver(){
        return player.isZero() || boss.isZero();
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
