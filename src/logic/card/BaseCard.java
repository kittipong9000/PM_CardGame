package logic.card;

import logic.player.Player;

public abstract class BaseCard {
    private String name;

    private int cost;
    private Buff buff;

    public BaseCard(String name,int cost){
        this.setName(name);
        this.setCost(cost);
        this.setbuff(Buff.NONE);
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Buff getbuff() {
        return this.buff;
    }
    public void setbuff(Buff buff) {
        this.buff = buff;
    }
    public abstract String getDesc();
    public abstract void play(Player traget,Player user);
    public abstract void pay(Player user);
    public abstract boolean canPlay(Player user);

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
