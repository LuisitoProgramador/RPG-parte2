public class Mage extends Character {
    private int mana;

    protected Mage(String name, int health , int mana) {
        super(name, health);
        this.mana = mana;
    }


    public void castSpell(Character target) {
        if(this.mana >= 10){
            this.mana -= 10;
            target.receiveDamage(15);
            target.status = Status.POISONED;
            
        }
    }
    public void heal(Character target){
        if(this.mana >= 15){
            this.mana -= 15;
            target.health += 20;

        }
    }
    public int getMana(){
        return this.mana;
    }
    
    
    
}
