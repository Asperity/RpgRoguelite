package RPGroguelite.Player;



public class Mage extends Player {

    public Mage()
    {
        super.setHealth(35);
    }

    public int attack()
    {
        int temp = (int)(Math.random()*10+1);
        if((int)(Math.random()*5+1)==1)
        {
            System.out.println("CRIT!\n");
            temp *= 2;
        }
        if((int)(Math.random()*5+1)<3)
        {
            System.out.println("Enemy is burning!\n");
            super.burning();
        }
        return temp;
    }

}
