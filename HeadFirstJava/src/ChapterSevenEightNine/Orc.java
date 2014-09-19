package ChapterSevenEightNine;

/**
 *class to represent an Orc, which is a type of monster and implements the moster
 * interface.
 * Created by DanielleErickson on 9/11/14.
 */
public class Orc implements Monster {
    private int hitPoints = 20;

    /**
     * method to take damage on this orc. Decreases its hitpoints by the specified
     * amount.
     * @param amount
     */
    @Override
    public void takeDamage(int amount) {
        if(hitPoints>=10){
            hitPoints-=10;
        }else{
            System.out.println("Cannot take damage, Orc is already dead");
        }
    }

    /**
     * returns the name of this orc.
     * @return
     */
    @Override
    public String name() {
        return "Orc";
    }

    /**
     * returns the number of hit points of this orc.
     * @return
     */
    @Override
    public int currentHitPoints() {
        return hitPoints;
    }

}
