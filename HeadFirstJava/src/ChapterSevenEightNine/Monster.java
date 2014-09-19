package ChapterSevenEightNine;

/**
 * Interface representing the characteristics of all monsters.
 * Created by DanielleErickson on 9/11/14.
 */
public interface Monster {
    public void takeDamage(int amount);
    public String name();
    public int currentHitPoints();
}
