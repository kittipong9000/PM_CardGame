package logic.player;

import logic.card.BaseCard;

import java.util.ArrayList;
import java.util.Arrays;

public class Player {
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
        this(new ArrayList<BaseCard>());
    }
    public Player(ArrayList<BaseCard> deck) {
        this.deck = deck;
        this.setHandForStart();
    }
    public void setHandForStart(){
        for(BaseCard bc : this.getHand()){
            this.getDeck().add(bc);
        }
        this.getHand().clear();
        for(int i=0;i<4 || this.isZero();i++){
            drawCard();
        }
    }
    public void drawCard(){
        getHand().add(getDeck().remove(0));
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

}
