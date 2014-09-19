/**
 * Contains the exercise for Chapter One
 * Created by DanielleErickson on 9/10/14.
 */
public class ChapterOne {
    /**
     * prints the sum of all the odd numbers between 0 and input n (inclusive).
     * @param n
     */
    public void printOddSum(int n){
        int total = 0;
        for(int i=1; i<=n; i=i+2){
            total+=i;
        }
        System.out.println(total);

    }


    public static void main (String [] args){
        ChapterOne one = new ChapterOne();
        one.printOddSum(100);
    }
}
