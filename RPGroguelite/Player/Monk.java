package RPGroguelite.Player;


public class Monk extends Player 
{
    private int temp;
    private int count; 

    public Monk()
    {
        super.setHealth(35);
    }
    
    public int attack()
    {
        if(count == 0)
        {
            temp = (int)(Math.random()*10+1);
        }
        else
        {
            temp += (int)(Math.random()*10+1);
        }
        if((int)(Math.random()*5+1)<=3 && count == 0)
        {
            System.out.println("CRIT!\n");
            temp*=2;
            if((int)(Math.random()*3+1)==1)
            {
            System.out.println("DOUBLE ATTACK!\n");
            count++;
            attack();
            }
            count = 0;
            return temp;
        }
        count = 0;
        return temp;
        
    }
}
