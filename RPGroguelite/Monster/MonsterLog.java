package RPGroguelite.Monster;
import java.util.Scanner;
import java.util.ArrayList;

public class MonsterLog {
    private Scanner s = new Scanner(System.in);
    private int menuChoice;
    private ArrayList<ArrayList<String>> monsterLog;
    private ArrayList<String> skeleton;
    private ArrayList<String> scorpion;
    private ArrayList<String> snowman;
    private ArrayList<String> zombie;
    private ArrayList<String> demon;
    private ArrayList<String> wolf;
    private ArrayList<String> mummy;
    private ArrayList<String> dragon;
    private ArrayList<String> yeti;

    public MonsterLog(){}

    public void createMonsterLog()
    {
        monsterLog.add(skeleton);
        monsterLog.add(scorpion);
        monsterLog.add(snowman);
        monsterLog.add(zombie);
        monsterLog.add(demon);
        monsterLog.add(wolf);
        monsterLog.add(mummy);
        monsterLog.add(dragon);
        monsterLog.add(yeti);
        
        monsterLog.get(0).add("Race: Skeleton");
        monsterLog.get(0).add("Class: Physical");
        monsterLog.get(0).add("Terrain: Swamps");
        monsterLog.get(0).add("Difficulty Class: Novice");
        monsterLog.get(0).add("Description:");
        monsterLog.get(0).add("Small and brittle creatures. Tend to roam where it is murky");
        monsterLog.get(0).add("They have a tendancy to pick up armor and weapons a dead aventurers.");

        monsterLog.get(1).add("Race: Scorpion");
        monsterLog.get(1).add("Class: Poision");
        monsterLog.get(1).add("Terrain: Desert");
        monsterLog.get(1).add("Difficulty Class: Novice");
        monsterLog.get(1).add("Description:");
        monsterLog.get(1).add(" Small insects that hide in the sands.");
        monsterLog.get(1).add("They tunnel under adventurers and attack with their poision tail from below");

        monsterLog.get(2).add("Race: Snowman");
        monsterLog.get(2).add("Class: Slow");
        monsterLog.get(2).add("Terrain: Tundra");
        monsterLog.get(2).add("Difficulty Class: Novice");
        monsterLog.get(2).add("Description:");
        monsterLog.get(2).add("Do not fall for their festive appearance. They have evolved to take an appearance");
        monsterLog.get(2).add("That throws adventurers off their guard. It is said that you cannot move an inch");
        monsterLog.get(2).add("If they envelope you in their snow. Aim to kill before that may occur.");

        monsterLog.get(3).add("Race: Zombie");
        monsterLog.get(3).add("Class: Poision");
        monsterLog.get(3).add("Terrain: Swamps or Miasma");
        monsterLog.get(3).add("Difficulty Class: Advanced");
        monsterLog.get(3).add("Description:");
        monsterLog.get(3).add("Slow undead. Roams around in surplus around areas that exude death.");
        monsterLog.get(3).add(" Their bite can leave the strongest of aventurers out of action for hours straight");

        monsterLog.get(4).add("Race: Demon");
        monsterLog.get(4).add("Class: Fire");
        monsterLog.get(4).add("Terrain: Desert or Molten");
        monsterLog.get(4).add("Difficulty Class: Advanced");
        monsterLog.get(4).add("Description:");
        monsterLog.get(4).add("The devil's hellspawn. Extremely quick creatures that have claws");
        monsterLog.get(4).add("that can burn through our best metals.");
        monsterLog.get(4).add("Avoid direct contact with their flurry of attacks");

        monsterLog.get(5).add("Race: Wolf");
        monsterLog.get(5).add("Class: Bleed");
        monsterLog.get(5).add("Terrain: Tundra or Blizzard");
        monsterLog.get(5).add("Difficulty Class: Advanced");
        monsterLog.get(5).add("Description:");
        monsterLog.get(5).add("The scavangers of the snow.");
        monsterLog.get(3).add("Their jaws are as strong as mythril leaving you with");
        monsterLog.get(3).add("prolonged bleeding. Known to perk up as a last ditch effort");
        monsterLog.get(3).add("when their back is against the wall");

        monsterLog.get(6).add("Race: Mummy");
        monsterLog.get(6).add("Class: Physical");
        monsterLog.get(6).add("Terrain: Miasma");
        monsterLog.get(6).add("Difficulty Class: Elite");
        monsterLog.get(6).add("Description:");
        monsterLog.get(6).add("");

        monsterLog.get(7).add("Race: Dragon");
        monsterLog.get(7).add("Class: Fire");
        monsterLog.get(7).add("Terrain: Molten");
        monsterLog.get(7).add("Difficulty Class: Elite");
        monsterLog.get(7).add("Description:");
        monsterLog.get(7).add("");

        monsterLog.get(8).add("Race: Yeti");
        monsterLog.get(8).add("Class: Slow");
        monsterLog.get(8).add("Terrain: Blizzard");
        monsterLog.get(8).add("Difficulty Class: Elite");
        monsterLog.get(8).add("Description:");
        monsterLog.get(8).add("");

    }
    
    public int printMonsterLogMenu() 
    {
        System.out.println("-----------------Monster Log-----------------\n\n\n");
        System.out.println("Choose a monster:\n");
        System.out.println("-Novice Enemies-\n");
        System.out.println("1: Skeleton");
        System.out.println("2: Scorpion");
        System.out.println("3: Snowman");
        System.out.println("\n\n-Advanced Enemies-\n");
        System.out.println("4: Zombie");
        System.out.println("5: Demon");
        System.out.println("6: Wolf");
        System.out.println("\n\n-Elite Enemies-\n");
        System.out.println("7: Mummy");
        System.out.println("8:Dragon");
        System.out.println("9:Yeti");
        return s.nextInt();
    }

    public void printMonsterLog()
    {
        menuChoice = printMonsterLogMenu();

        for(int i=0;i< monsterLog.get(menuChoice).size(); i++)
            {
                System.out.println(monsterLog.get(menuChoice).get(i));
            }

    }

}
