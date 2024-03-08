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
        System.out.println("1");
        playerPlay();
        if (isGameOver()) {
            return;
        }
        System.out.println("2");

        bossPlay();

        System.out.println("3");

        if (isGameOver()) {
            return;
        }
    }

    public void playerPlay() {
        boolean continuePlaying = true; // ตั้งค่าตัวแปรเพื่อบอกว่าผู้เล่นต้องการเล่นการ์ดต่อหรือไม่

        while (continuePlaying && !player.getHand().isEmpty()) { // ทำการวนลูปไปเรื่อย ๆ ถ้าผู้เล่นต้องการเล่นการ์ดต่อ และยังมีการ์ดในมือของผู้เล่น
            System.out.println( "Player Card : "+ this.getPlayer().getDeck().size());
            System.out.println( "BOSS Card : "+ this.getBoss().getDeck().size());

            System.out.println("Your Cards: ");
            for(int i = 0; i < player.getHand().size(); i++){
                System.out.println((i + 1) + " " + player.getHand().get(i).getDesc());
            }

            System.out.println("Select a card to play (Enter 0 to stop playing): ");
            int cardIndex = scanner.nextInt();

            if (cardIndex == 0) { // ถ้าผู้เล่นเลือกใช้การ์ดหมายเลข 0 ให้หยุดการเล่น
                continuePlaying = false;
            } else if (cardIndex > 0 && cardIndex <= player.getHand().size()) { // ตรวจสอบว่าผู้เล่นเลือกการ์ดที่มีอยู่จริงหรือไม่
                BaseCard selectedCard = player.getHand().get(cardIndex - 1);
                selectedCard.play(boss,player);
                player.getHand().remove(cardIndex - 1); // ลบการ์ดที่เล่นออกจากมือของผู้เล่น
                if (isGameOver()) {
                    return;
                }
            } else {
                System.out.println("Invalid selection. Please select a valid card or enter 0 to stop playing.");
            }
        }
    }


    public void bossPlay(){
        this.boss.setHandForStart();
        BaseCard selectedCard = boss.getHand().get(0);
        selectedCard.play(player,boss);
        this.boss.getHand().remove(0);
        System.out.println("Boss play "+selectedCard.getName());
    }



    public boolean isGameOver(){
         return player.isZero() || boss.isZero();
    }

    public void gameEnd(){
        if(player.isZero()){
            System.out.println("You LOSE");
        } else {
            System.out.println("You WIN");
        }
    }


    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Enemy getBoss() {
        return this.boss;
    }

    public void setBoss(Enemy boss) {
        this.boss = boss;
    }
}
