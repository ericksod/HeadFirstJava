package ChapterSevenEightNine;

/**
 * class to represent a Troll, which is a type of Monster and implements the Monster
 * interface.
 * Created by DanielleErickson on 9/11/14.
 */
public class Troll implements Monster {
    private int hitPoints=40;

    /**
     * method to damage this monster. The hitpoints are decreased by the specified
     * amount.
     * @param amount
     */
   @Override
    public void takeDamage(int amount) {
        if(hitPoints>=5){
            hitPoints-=5;
        }else{
            System.out.println("Cannot take damage, Troll is already dead");
        }
    }

    /**
     * returns the name of this troll.
     * @return
     */
    @Override
    public String name() {
        return "Troll";
    }

    /**
     * returns the current hit points of this troll.
     * @return
     */
    @Override
    public int currentHitPoints() {
        return hitPoints;
    }
}
