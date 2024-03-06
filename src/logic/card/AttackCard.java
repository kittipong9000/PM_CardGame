package logic.card;

public class AttackCard extends BaseCard{
    private int power;
    private int cost;
    public AttackCard(String name,int power,int cost){
        super(name);
        this.setPower(power);
        this.setCost(cost);
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}
