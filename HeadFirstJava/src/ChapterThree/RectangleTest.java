package ChapterThree;

import junit.framework.TestCase;
import org.junit.Test;

public class RectangleTest extends TestCase {
    @Test
    public void testArea(){
        Rectangle rect = new Rectangle(5,2);
        assertEquals(10, rect.area());
    }

}