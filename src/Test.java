import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Warrior warrior1 = new Warrior("Ruby", "Female");
        Warrior warrior2 = new Warrior("Leon","Male");

        Mage mage1 = new Mage("Raven", "Female");
        Mage mage2 = new Mage("Jace", "Male");

        warrior1.printInfo();
        System.out.println("---------------------------------");
        warrior2.attack();
        warrior2.attack();
        warrior2.attack();
        warrior2.regeneratePower();
        warrior2.attack();
        System.out.println("--------------------------------");
        warrior2.printInfo();

        System.out.println("--------------------------------");

        mage1.attack();
        mage1.attack();
        mage1.attack();
        mage1.regeneratePower();
        mage1.attack();

        System.out.println("-----------------------------------");

        mage1.printInfo();



        ArrayList<Character>list1 = new ArrayList<>();
        list1.add(mage1);
        list1.add(warrior2);

        ArrayList<Character> list2 = new ArrayList<>();
        list2.add(mage1);
        list2.add(mage2);

        ArrayList<Character> list3 = new ArrayList<>();
        list3.add(mage1);
        list3.add(mage2);
        list3.add(warrior1);

        Player player1 = new Player("Jason" , "12345", list1);
        Player player2 = new Player("Elena", "45678", list2);
        Player player3 = new Player("Damon", "123456", list3);

        ArrayList<Player> game = new ArrayList<>();

        game.add(player1);
        game.add(player2);
        game.add(player3);

        System.out.println("-------Who Is Attacking?--------");
        game.get(0).getCharacters().get(0).attack();
        game.get(1).getCharacters().get(1).attack();
        game.get(2).getCharacters().get(2).attack();

        System.out.println("-------Who Is Performing?--------");
        game.get(1).getCharacters().get(0).regeneratePower();
        game.get(0).getCharacters().get(1).regeneratePower();

        double highestTotalDamage = game.get(0).calculateTotalDamage();
        int highestTotalDamagePlayerIndex = 0;

        for (int i=0; i<game.size(); i++){
            System.out.println("Player " +game.get(i).getName()+"'s total damage: "
                    +game.get(i).calculateTotalDamage() );

            if (highestTotalDamage < game.get(i).calculateTotalDamage()){
                highestTotalDamage = game.get(i).calculateTotalDamage();
                highestTotalDamagePlayerIndex = i;
            }
        }

        System.out.println("Player with the highest damage: " +game.get(highestTotalDamagePlayerIndex).getName());

        System.out.println("--------All Players' Info---------");
        for (int i=0 ; i <game.size(); i++){
            game.get(i).printPlayerInfo();
        }

    }
}
