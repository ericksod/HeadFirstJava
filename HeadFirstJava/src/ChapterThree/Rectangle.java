package ChapterThree;

/**
 * Rectangle class with characteristics of a rectangle.
 * Created by DanielleErickson on 9/10/14.
 */
public class Rectangle {
    private int width;
    private int height;

    /**
     * creates a rectangle with inputted width and height.
     * @param width
     * @param height
     */
    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    /**
     * calculates and returns the area of this rectangle object.
     * @return
     */
    public int area(){
        return width*height;
    }
}
