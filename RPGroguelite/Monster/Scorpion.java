package RPGroguelite.Monster;

public class Scorpion extends Monster {
    private boolean isUnderground;
    
    public Scorpion()
    {
        super.setDamage(5);
        super.setHealth(20);
        super.setSpeed(35);
    }

    public void burrow()
    {
        isUnderground = true;
    } 
}
