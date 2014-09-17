package ChapterSevenEightNine;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonsterManagerTest {
    @Test
    public void testOrc(){
        Orc o = new Orc();
        assertEquals(20, o.currentHitPoints());
        o.takeDamage(10);
        assertEquals(10, o.currentHitPoints());
    }

    @Test
    public void testTroll(){
        Troll t = new Troll();
        assertEquals(40, t.currentHitPoints());
        t.takeDamage(10);
        assertEquals(35, t.currentHitPoints());
    }

    /*
    printed results instead of asserting
     */
    @Test
            public void testTakeDamage() {
        MonsterManager m = new MonsterManager();
        Orc o;
        Troll t;
        for (int i = 0; i < 5; i++) {
            o = new Orc();
            t = new Troll();
            m.addMonster(o);
            m.addMonster(t);
        }
        m.takeDamage(10);
        m.printMonsterPoints();
    }

}