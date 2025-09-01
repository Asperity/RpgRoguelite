package RPGroguelite;

public class Player {
    private int health;
    private int strength;
    private int sanity;
    private int arts;
    private int vitality;
    private boolean isDefending;
    private int numPots = 2;

    public Player(){}

   

    public void setHealth(int h)
    {
        health = h;
    }

    public void setStrength(int str)
    {
        strength = str;
    }

    public void setSanity(int san)
    {
        sanity = san;
    }

    public void setArts(int art)
    {
        arts = art;
    }

    public void setVitality(int vit)
    {
        vitality = vit;
    }

    public void defend()
    {
        isDefending = true;
    }


    public void usePot()
    {
        if(numPots != 0)
        {
            numPots--;
            health += 5;
        }
    }

    

     public int setPots(int p)
    {
        return numPots = p;
    }

    public int getHealth()
    {
        return health;
    }

     public int gotHit(int d)
    {
        return health -= d;
    }

    public int attack()
    {
        int temp = (int)(Math.random()*10+1);
        if((int)(Math.random()*5+1)==1)
        {
            return temp*2;
        }
        else
        {
            return temp;
        }
    }
    public boolean getDefense()
    {
        return isDefending;
    }

    public int getPotions()
    {
        return numPots;
    }

    public boolean shatterDefense()
    {
        return isDefending = false;
    }

    
}
