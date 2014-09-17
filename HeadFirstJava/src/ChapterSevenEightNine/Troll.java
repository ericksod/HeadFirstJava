package ChapterSevenEightNine;

/**
 * Created by DanielleErickson on 9/11/14.
 */
public class Troll implements Monster {
    private int hitPoints=40;


   /*
   never use param, necessary????
    */
   @Override
    public void takeDamage(int amount) {
        if(hitPoints>=5){
            hitPoints-=5;
        }else{
            System.out.println("Cannot take damage, Troll is already dead");
        }
    }

    @Override
    public String name() {
        return "Troll";
    }

    @Override
    public int currentHitPoints() {
        return hitPoints;
    }
}
