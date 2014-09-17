package ChapterFour;

import ChapterThree.*;
import ChapterThree.RectangleManager;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class RectangleManagerTest {
    @Test
    public void testRectPerim(){
        ChapterFour.Rectangle rect;
        ChapterFour.Rectangle[] ar = new ChapterFour.Rectangle[5];
        int j = 5;
        for(int i = 1; i<6; i++){
            rect = new ChapterFour.Rectangle(i,j);
            ar[i-1]=rect;
            j++;
        }
        ChapterFour.RectangleManager rectMan = new ChapterFour.RectangleManager(ar);
        int total=0;
        for(int m=0;m<5;m++ ){
            total += ar[m].perimeter();
        }
        assertEquals(total, rectMan.totalPerimeter());

    }

}