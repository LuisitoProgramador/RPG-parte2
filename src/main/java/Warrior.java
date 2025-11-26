public class Warrior extends Character{
    private int strength;

    protected Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    public void  performHeavyAttack(Character target){
        target.receiveDamage(this.strength);
    }
    public void enterBerserkMode(){
        status = Status.FURIOUS; 
    }
    public int getStrength(){
        return this.strength;
    }
}
