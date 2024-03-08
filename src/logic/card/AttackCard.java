package logic.card;

import logic.player.Player;

public class AttackCard extends BaseCard{
    private int power;
    public AttackCard(String name,int power,int cost){
        super(name,cost);
        this.setPower(power);
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public void play(Player traget,Player user){
        if(canPlay(user)){
            traget.reduceDeck(this.getPower());
            pay(user);
        }
    }
    @Override
    public void pay(Player user) {
        user.reduceDeck(this.getCost());
    }
    @Override
    public boolean canPlay(Player user) {
        return user.getDeck().size() >= this.getCost();
    }
    @Override
    public String getDesc() {
        return this.getName() +" power :"+this.getPower() +" cost :"+this.getCost();
    }
}
