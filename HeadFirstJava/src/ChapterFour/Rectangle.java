package ChapterFour;

/**
 * class to represent a rectangle.
 * Created by DanielleErickson on 9/10/14.
 */
public class Rectangle {
    private int width;
    private int height;

    /**
     * creates a new Rectangle with inputted width and height.
     * @param width
     * @param height
     */
    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    /**
     * calculates and returns the area of this Rectangle object.
     * @return
     */
    public int area(){
        return width*height;
    }

    /**
     * calculates and returns the perimeter of this Rectangle object.
     * @return
     */
    public int perimeter(){
        return ((2*width) + (2*height));
    }
}
