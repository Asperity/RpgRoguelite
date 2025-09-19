package RPGroguelite.Mechanics;
import java.util.Scanner;

import RPGroguelite.Player.Knight;
import RPGroguelite.Player.Mage;
import RPGroguelite.Player.Monk;
import RPGroguelite.Player.Player;
import RPGroguelite.Player.Shielder;

import java.util.ArrayList;

public class Game 
{
    private Player player;
    private String playerClass;
    private int playerMove;
    private int turns;
    private Scanner s = new Scanner(System.in);
    private ArrayList<ArrayList<String>> dungeon;
    private ArrayList<String> dungeonName;

     public void chooseClass()
    {
        while (true)
        {
            System.out.println("Player One, what class would you like to be? (Knight, Mage, Monk, Shielder)");
            
            try
            {
                playerClass = s.next();
                if(playerClass.equals("Knight"))
                {
                    player = new Knight();
                    break;
                }
                else if(playerClass.equals("Mage"))
                {
                    player = new Mage();
                    break;
                }
                else if(playerClass.equals("Monk"))
                {
                    player = new Monk();
                    break;
                }
                else if(playerClass.equals("Shielder"))
                {
                    player = new Shielder();
                    break;
                }
                else
                {
                    System.out.println("Choose a class");
                }
                runGame();
            }
            catch(Exception e)
            {
                System.out.println("caught");
            }
        }
    }

    public void runGame()
    {
        Dungeon d = new Dungeon();
        d.addDungeons();
        ArrayList<String> selectedDungeon;
        while(turns != 30)
        {
            dungeon = d.createDungeons();
            displayInfo();
            playerMove = s.nextInt();
            while (true)
            {
                if(playerMove == 1)
                {
                    selectedDungeon = dungeon.get(0);
                    break;
                }
                else if(playerMove == 2)
                {
                    selectedDungeon = dungeon.get(1);
                    break;
                }
                else if (playerMove == 3)
                {
                    selectedDungeon = dungeon.get(2);
                    break;
                }
                else if (playerMove == 4)
                {
                    selectedDungeon = dungeon.get(3);
                    break;
                }
                else
                {
                    System.out.println("Invalid number\n");
                }
            }
            

        }
    }
    public void displayInfo()
    {
        System.out.println("Here is the status of every dungeon \n The conditions change daily\n");
        for(int i=0;i<dungeon.size();i++)
        {
            dungeonName = dungeon.get(i);
            System.out.println("Dungeon "+ (i+1) +": " + dungeonName.get(0) + "\n");
            System.out.println("Terrain: " + dungeonName.get(1) + "\n");
            System.out.println("Condition: " + dungeonName.get(2) + "\n");
            System.out.println("Abudance: " + dungeonName.get(3) + "\n");
            System.out.println("Monsters:\n");
            for(int j=4;j<dungeonName.size();j++)
                {
                    System.out.println(dungeonName.get(j));
                }
        }
        System.out.println("\n Select a Dungeon");
        playerMove = s.nextInt();
    }
}
