package ChapterThree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RectangleManagerTest {
    @Test
    public void testRectMan(){
        Rectangle rect;
        Rectangle [] ar = new Rectangle [5];
        int j = 5;
        for(int i = 1; i<6; i++){
            rect = new Rectangle(i,j);
            ar[i-1]=rect;
            j++;
        }
        RectangleManager rectMan = new RectangleManager(ar);
        int total=0;
        for(int m=0;m<5;m++ ){
            total += ar[m].area();
        }
        assertEquals(total, rectMan.totalArea());

    }

}