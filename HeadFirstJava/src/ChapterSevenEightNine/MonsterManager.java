package ChapterSevenEightNine;

import java.util.ArrayList;

/**
 * class to manage and perform action on multiple monsters.
 * Created by DanielleErickson on 9/11/14.
 */
public class MonsterManager {
    private ArrayList<Monster> monsters = new ArrayList<Monster>();

    /**
     * method to add a monster to this monsterManager.
     * @param toAdd
     */
    public void addMonster(Monster toAdd){
        monsters.add(toAdd);
    }

    /**
     * method that takes the desired amount of damage off of all of the monsters
     * in this monsterManager.
     * @param amount
     */
    public void takeDamage(int amount){
        for (int i=0; i<monsters.size(); i++){
            if(monsters.get(i) instanceof Troll){
                monsters.get(i).takeDamage(amount);
            }
            monsters.get(i).takeDamage(amount);
        }
    }

    /**
     * method that prints the current hit points of all monsters in this monster
     * manager.
     */
    public void printMonsterPoints(){
        Monster cur;
        for(int i = 0; i<monsters.size(); i++){
            cur = monsters.get(i);
            System.out.println(cur.name() + " has "+cur.currentHitPoints()+" current hit points.");
        }
    }

    public static void main(String [] args){
        MonsterManager m= new MonsterManager();
        Orc o;
        Troll t;
        for(int i = 0; i<5; i++){
            o = new Orc();
            t = new Troll();
            m.addMonster(o);
            m.addMonster(t);
        }
        m.takeDamage(10);
        m.printMonsterPoints();
    }
}
