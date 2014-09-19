/**
 * Exercise for Chapter Two
 * Created by DanielleErickson on 9/10/14.
 */
public class ChapterTwo {
    private static int incrementCalled = 0;

    /**
     * increments the global field recording how many times this method has been called
     */
    public void increment(){
        incrementCalled++;
    }

    /**
     * prints the number of times increment() has been called
     */
    public void total(){
        System.out.println(incrementCalled);
    }

    public static void main(String [] args){
        ChapterTwo two = new ChapterTwo();
        for(int i =0; i<5; i++){
            two.increment();
        }
        two.total();
    }
}
