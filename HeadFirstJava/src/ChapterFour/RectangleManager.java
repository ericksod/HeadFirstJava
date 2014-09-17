package ChapterFour;

import ChapterThree.Rectangle;

/**
 * Created by DanielleErickson on 9/10/14.
 */
public class RectangleManager {
    private ChapterFour.Rectangle[] ar;
//    public RectangleManager(int numRects){
//        ar = new Rectangle [numRects];
//    }
    public RectangleManager(ChapterFour.Rectangle[] rectAr){
        ar = rectAr;
    }
//    public void addRect(Rectangle toAdd){
//
//    }

    public void totalArea() {
        int total = 0;
        for (int i = 0; i < ar.length; i++) {
            total += ar[i].area();
        }
        System.out.println("Total Area: "+total);
    }

    public int totalPerimeter(){
        int total = 0;
        for (int i = 0; i < ar.length; i++) {
            total += ar[i].perimeter();
        }
        System.out.println("Total Perimeter: "+total);
        return total;
    }

    public static void main(String [] args){
        ChapterFour.Rectangle one = new ChapterFour.Rectangle(1,2);
        ChapterFour.Rectangle two = new ChapterFour.Rectangle(3,4);
        ChapterFour.Rectangle three = new ChapterFour.Rectangle(5,6);
        ChapterFour.Rectangle four = new ChapterFour.Rectangle(7,8);
        ChapterFour.Rectangle five = new ChapterFour.Rectangle(9,10);
        ChapterFour.Rectangle[] rectAr = {one, two, three, four, five};
        RectangleManager rectMan= new RectangleManager(rectAr);
        rectMan.totalArea();
        rectMan.totalPerimeter();
    }
}
