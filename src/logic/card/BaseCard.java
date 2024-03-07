package logic.card;

import logic.player.Player;

public abstract class BaseCard {
    private String name;
    private Buff buff;

    public BaseCard(String name){
        this.setName(name);
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
    public abstract void play(Player traget);
}
