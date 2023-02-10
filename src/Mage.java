public class Mage extends Character {
    private int mana;

    public Mage() {
        this.mana = 10;
    }

    public Mage(String name, String gender) {
        super(name, gender);
        this.mana = 10;
    }

    private void drinkPotion(){
        int newMana = mana +10;
        System.out.println("Updated mana: " +newMana);
    }

    @Override
    public double calculateDamage() {
        return (getHitPoint() * 0.8);
    }

    @Override
    public void attack() {
        if (mana < 5)
            System.out.println("Not enough mana...Drink potion...");
        else{
            int remainingMana = mana -5;
            super.attack();
            System.out.println("Remaining mana: " +remainingMana);
        }
    }

    @Override
    public void regeneratePower() {
        drinkPotion();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("\tMage mana: " +mana +"\n");
    }
}
