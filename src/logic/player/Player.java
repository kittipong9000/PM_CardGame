package logic.player;

import logic.card.BaseCard;

import java.util.ArrayList;
import java.util.Arrays;

public class Player {
    private int cardInHand;
    private ArrayList<BaseCard> deck;
    private ArrayList<BaseCard> hand;
    private boolean isdead = false;
    public boolean isZero(){
        return deck.size() <= 0;
    }
    public boolean isDead(){
        return isdead;
    }
    public void setisDead(boolean bool){
        this.isdead = bool;
    }

    public Player() {
        this.setCardInHand(4);
        this.deck = new ArrayList<>(); // กำหนดค่าให้กับ deck
        this.hand = new ArrayList<>(); // กำหนดค่าให้กับ hand
    }
    public Player(ArrayList<BaseCard> deck) {
        this.setCardInHand(4);
        this.deck = deck;
        this.hand = new ArrayList<>(); // เพิ่มการกำหนดค่าให้กับ hand
        this.setHandForStart();
    }
    public void setHandForStart(){
        if (!this.hand.isEmpty()) {
            for(BaseCard bc : this.getHand()){
                this.getDeck().add(bc);
            }
            this.getHand().clear();
        }

        // เพิ่มเงื่อนไขเช็คจำนวนการ์ดใน deck ก่อนเรียกใช้ drawCard()
        if (this.getDeck().size() > 0) {
            for(int i=0; i<this.cardInHand || this.isZero(); i++){
                drawCard();
            }
        }
    }

    public void drawCard(){
        if (!this.deck.isEmpty()) {
            BaseCard drawnCard = this.deck.remove(0);
            this.hand.add(drawnCard);
        }
    }
    public ArrayList<BaseCard> getDeck() {
        return this.deck;
    }
    public void setDeck(ArrayList<BaseCard> deck) {
        this.deck = deck;
    }
    public ArrayList<BaseCard> getHand() {
        return this.hand;
    }
    public void setHand(ArrayList<BaseCard> hand) {
        this.hand = hand;
    }

    public int getCardInHand() {
        return this.cardInHand;
    }
    public void setCardInHand(int cardInHand) {
        this.cardInHand = cardInHand;
    }
    public void reduceDeck(int dmg){
        if (dmg >= this.getDeck().size()){
            dmg = this.getDeck().size();
        }
        for (int i=0;i<dmg;i++){
            this.getDeck().remove(0);
        }
    }

}
