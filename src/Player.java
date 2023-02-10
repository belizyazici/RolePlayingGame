import java.util.ArrayList;

public class Player {
    private String name;
    private String password;
    private ArrayList<Character> characters;

    public Player() {
    }

    public Player(String name, String password, ArrayList<Character> characters) {
        this.name = name;
        this.password = password;
        this.characters = characters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public double calculateTotalDamage(){
        double totalDamage=0;

        for (int i=0; i< characters.size(); i++){
            int hitPoint=0;
            totalDamage += characters.get(i).calculateDamage();
        }
        return totalDamage;
    }

    public void printPlayerInfo(){
        System.out.println("Player name: " +name + "\tPlayer password: " +password);

        for (int i=0; i< characters.size(); i++){
            characters.get(i).printInfo();
        }

    }


}
