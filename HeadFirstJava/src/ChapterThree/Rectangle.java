package ChapterThree;

/**
 * Created by DanielleErickson on 9/10/14.
 */
public class Rectangle {
    private int width;
    private int height;
    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    public int area(){
        return width*height;
    }
}
