package ChapterSevenEightNine;

/**
 * Created by DanielleErickson on 9/11/14.
 */
public class Orc implements Monster {
    private int hitPoints = 20;
    /*
    never use param, necessary???
     */

    @Override
    public void takeDamage(int amount) {
        if(hitPoints>=10){
            hitPoints-=10;
        }else{
            System.out.println("Cannot take damage, Orc is already dead");
        }
    }

    @Override
    public String name() {
        return "Orc";
    }

    @Override
    public int currentHitPoints() {
        return hitPoints;
    }

}
