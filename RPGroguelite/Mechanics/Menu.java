package RPGroguelite.Mechanics;
import java.util.Scanner;
import RPGroguelite.Monster.MonsterLog;

public class Menu {
    private Scanner s = new Scanner(System.in);
    private int menuChoice;
    private Game g;
    private MonsterLog m;
    
    public void printMenu()
    {
        m.createMonsterLog();
        System.out.println("-----------------RPGRoguelite-----------------\n\n\n");
        System.out.println("Select an Option:\n");
        System.out.println("1: Play Game");
        System.out.println("2: Inheritance List");
        System.out.println("3: Duel");
        System.out.println("4: Logs");
        System.out.println("5: Quit");
        menuChoice = s.nextInt();
        if(menuChoice == 1)
        {
            g.chooseClass();
        }
        else if(menuChoice == 4)
        {
            System.out.println("Which log would you like to view?");
            System.out.println("1: Monster");
            System.out.println("2: Dungeon");
            System.out.println("3: Item");
            System.out.println("4: Skill");
            System.out.println("5: Adventurers");
            menuChoice = s.nextInt();
            if(menuChoice == 1)
            {
                m.printMonsterLogMenu();
            }

        }
        else if(menuChoice == 5)
        {
            System.exit(0);
        }
        
    }
}
