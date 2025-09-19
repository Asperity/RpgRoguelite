package RPGroguelite.Monster;

public class Skeleton extends Monster {

    public Skeleton()
    {
        super.setDamage(3);
        super.setHealth(15);
        super.setSpeed(30);
    }
    
    public void gearUp()
    {
        if((int)(Math.random()*2+1) == 1)
        {
           super.setDamage(getDamage()+3); 
        }
        else
        {
            super.setHealth(getHealth()+5);
        }
    }
}
