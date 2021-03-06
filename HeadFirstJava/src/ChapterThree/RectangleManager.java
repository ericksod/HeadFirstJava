package ChapterThree;

/**
 * class to manage and perform actions on multiple rectangles.
 * Created by DanielleErickson on 9/10/14.
 */
public class RectangleManager {
    private Rectangle [] ar;

    /**
     * creates a new RectangleManager with a given array of Rectangles.
     */
    public RectangleManager(Rectangle [] rectAr){
        ar = rectAr;
    }

    /**
     * calculates and returns the sum of the areas of all the Rectangles in this
     * RectangleManager.
     * @return
     */
    public int totalArea() {
        int total = 0;
        for (int i = 0; i < ar.length; i++) {
            total += ar[i].area();
        }
        System.out.println("Total Area: "+total);
        return total;
    }

    public static void main(String [] args){
        Rectangle one = new Rectangle(1,2);
        Rectangle two = new Rectangle(3,4);
        Rectangle three = new Rectangle(5,6);
        Rectangle four = new Rectangle(7,8);
        Rectangle five = new Rectangle(9,10);
        Rectangle [] rectAr = {one, two, three, four, five};
        RectangleManager rectMan= new RectangleManager(rectAr);
        rectMan.totalArea();
    }
}
