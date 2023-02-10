public class Warrior extends Character {
    private int energy;

    public Warrior() {
        this.energy = 20;
    }

    public Warrior(String name, String gender) {
        super(name, gender);
        this.energy = 20;
    }

    private void rest(){
        System.out.println("Resting...");
        this.energy += 20;
        System.out.println("Updated energy: "  +energy);
    }

    @Override
    public double calculateDamage() {
        return getHitPoint() * 1.2;
    }

    @Override
    public void attack() {
        if (energy < 10)
            System.out.println("Not enough energy. Get rest...");
        else{
            energy = energy -10;
            super.attack();
        }
        System.out.println("Remaining energy: " +energy);
    }

    @Override
    public void regeneratePower() {
        rest();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("\tWarrior's energy: " +energy +"\n");
    }
}
