package ChapterFour;

import ChapterThree.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void testArea(){
        Rectangle rect = new Rectangle(1,3);
        assertEquals(3, rect.area());
    }

    @Test
    public void testPerim(){
        Rectangle rect = new Rectangle(2,5);
        assertEquals(14, rect.perimeter());
    }

}