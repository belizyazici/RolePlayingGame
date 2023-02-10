public class Character {
    private String name;
    private double hitPoint;
    private String gender;

    public Character() {
    }

    public Character(String name, String gender) {
        this.name = name;
        this.hitPoint = 10;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(double hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double calculateDamage(){
        return hitPoint;
    }

    public void attack(){
        System.out.println("Attacking...Damage is: " +calculateDamage());
    }

    public void regeneratePower(){
        System.out.println("Regenerating Power");

    }

    public void printInfo(){
        System.out.println("Character name: " + name );
        System.out.println("\tHit Point: " + hitPoint);
        System.out.println("\tGender: " +gender);


    }
}
