package RPGroguelite.Mechanics;
import java.util.ArrayList;

import RPGroguelite.Monster.Monster;

public class Dungeon 
{
   
    private String[] terrain = {"Swamp","Miasma","Tundra","Blizzard","Desert","Molten"};
    private String[] condition= {"Freezing","Chilly","Rotting","Decayed","Hellfire","Burning"};
    private String[] abudance = {"Minimal", "Average", "Overwhelming", "Nightmarish"};
    private ArrayList<String> dungeonOne = new ArrayList<String>();
    private ArrayList<String> dungeonTwo = new ArrayList<String>();
    private ArrayList<String> dungeonThree = new ArrayList<String>();
    private ArrayList<String> dungeonFour = new ArrayList<String>();
    private ArrayList<ArrayList<String>> dungeon = new ArrayList<ArrayList<String>>();
    private String dungeonTerrain;
    private String dungeonCondition;
    private String dungeonAbudance;
    private Boolean difficultTerrain;
    private Boolean difficultCondition;
    private String[] monsterList;
    private int waves;
    private Monster monsterGetter = new Monster();


    public Dungeon(){}

    public void addDungeons()
    {
        dungeon.add(dungeonOne); 
        dungeon.add(dungeonTwo);
        dungeon.add(dungeonThree);
        dungeon.add(dungeonFour);
        dungeon.get(0).add("Trial of Strength");
        dungeon.get(1).add("Trial of Vitality");
        dungeon.get(2).add("Trial of Faith");
        dungeon.get(3).add("Trial of the Arts");
        monsterList = monsterGetter.getMonsterArray();
    }

    public ArrayList<ArrayList<String>> createDungeons()
    {
        
        for(int i=0;i<dungeon.size();i++)
        {
            dungeon.get(i).add(terrain[(int)(Math.random()*6)]);
            dungeonTerrain=dungeon.get(i).get(0);
            if(dungeonTerrain == "Swamp")
            {
                difficultTerrain = false;
                if((int)(Math.random()*20+1)==1)
                {
                    dungeon.get(i).add(condition[2]);
                    difficultCondition = true;
                }
                else
                {
                    dungeon.get(i).add(condition[3]);
                    difficultCondition = false;
                }
            }
            else if(dungeonTerrain == "Miasma")
            {
                difficultTerrain = true;
                if((int)(Math.random()*5+1)<=3)
                {
                    dungeon.get(i).add(condition[2]);
                    difficultCondition = true;
                }
                else
                {
                    dungeon.get(i).add(condition[3]);
                    difficultCondition = false;
                }
            }
            else if(dungeonTerrain == "Tundra")
            {
                difficultTerrain = false;
                if((int)(Math.random()*20+1)==1)
                {
                    dungeon.get(i).add(condition[0]);
                    difficultCondition = true;
                }
                else
                {
                    dungeon.get(i).add(condition[1]);
                    difficultCondition = false;
                }
            }
            else if(dungeonTerrain == "Blizzard")
            {
                difficultTerrain = true;
                if((int)(Math.random()*5+1)<=3)
                {
                    dungeon.get(i).add(condition[0]);
                    difficultCondition = true;
                }
                else
                {
                    dungeon.get(i).add(condition[1]);
                    difficultCondition = false;
                }
            }
            else if(dungeonTerrain == "Desert")
            {
                difficultTerrain = false;
                if((int)(Math.random()*20+1)==1)
                {
                    dungeon.get(i).add(condition[4]);
                    difficultCondition = true;
                }
                else
                {
                    dungeon.get(i).add(condition[5]);
                    difficultCondition = false;
                }
            }
            else
            {
                difficultTerrain = true;
                if((int)(Math.random()*5+1)<=3)
                {
                    dungeon.get(i).add(condition[4]);
                    difficultCondition = true;
                }
                else
                {
                    dungeon.get(i).add(condition[5]);
                    difficultCondition = false;
                }
            }
            dungeonCondition = dungeon.get(i).get(1);

            if(difficultTerrain && difficultCondition)
            {
                dungeon.get(i).add(abudance[3]);
                waves = 5;
            }
            else if(difficultTerrain && !difficultCondition)
            {
                if((int)(Math.random()*2+1)==1)
                {
                    dungeon.get(i).add(abudance[2]);
                    waves = 3;

                }
                else
                {
                    dungeon.get(i).add(abudance[1]);
                    waves = 2;
                }
            }
            else
            {
                dungeon.get(i).add(abudance[0]);
                waves = 1;
            }
            dungeonAbudance = dungeon.get(i).get(2);

            if(dungeonTerrain == "Tundra" || dungeonTerrain == "Blizzard")
            {
                for(int j=0;j<waves;j++)
                {
                    if((int)(Math.random()*3+1)==1)
                    {
                        dungeon.get(i).add(monsterList[1]);
                    }
                    else
                    {
                        if((int)(Math.random()*2+1)==1)
                        {
                            dungeon.get(i).add(monsterList[3]);
                        }
                        else
                        {
                            dungeon.get(i).add(monsterList[4]);
                        }
                    }
                }
            }
            else if(dungeonTerrain == "Swamp" || dungeonTerrain == "Miasma")
            {
                for(int j=0;j<waves;j++)
                {
                    if((int)(Math.random()*3+1)==1)
                    {
                        dungeon.get(i).add(monsterList[0]);
                    }
                    else
                    {
                        if((int)(Math.random()*2+1)==1)
                        {
                            dungeon.get(i).add(monsterList[5]);
                        }
                        else
                        {
                            dungeon.get(i).add(monsterList[6]);
                        }
                    }
                }
            }
            else
            {
                for(int j=0;j<waves;j++)
                {
                    if((int)(Math.random()*3+1)==1)
                    {
                        dungeon.get(i).add(monsterList[2]);
                    }
                    else
                    {
                        if((int)Math.random()*2+1==1)
                        {
                            dungeon.get(i).add(monsterList[7]);
                        }
                        else
                        {
                            dungeon.get(i).add(monsterList[8]);
                        }
                    }
                }
            }
        }
        return dungeon;
    }


}
