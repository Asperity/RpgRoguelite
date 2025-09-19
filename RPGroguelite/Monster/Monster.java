package RPGroguelite.Monster;
import java.util.ArrayList;

public class Monster 
{
    private int health;
    private int damage;
    private int speed;
    private ArrayList<Integer> monsterStats;

    public Monster(int h, int d, int s)
    {
        health = h;
        damage = d;
        speed = s;
    }

    public Monster(){}

    public void setHealth(int h)
    {
        health = h;
    }

    public void setDamage(int d)
    {
        damage = d;
    }

    public void setSpeed(int s)
    {
        speed = s;
    }

    public int getDamage()
    {
        return damage;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getHealth()
    {
        return health;
    }

    public void gotHit(int h)
    {
        health-=h;
    }

    public int attack()
    {
        int temp = (int)(Math.random()*damage+1);
        if((int)(Math.random()*5+1)==1)
        {
            return temp*2;
        }
        else
        {
            return temp;
        }
    }
}
