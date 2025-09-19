package RPGroguelite.Monster;

public class Demon extends Monster {

    public Demon()
    {
        super.setHealth(35);
        super.setSpeed(50);
        super.setDamage(10);
    }

    public int scortchingScratch()
    {
      int temp = (int)(Math.random()*super.getDamage()+1);
        if((int)(Math.random()*5+1)==1)
        {
            return temp*2;
        }
        else
        {
            return temp;
        }  
    }

    public void swiftStep()
    {
        super.setSpeed(super.getSpeed()+5);
    }
    
}
