/**
 * Created by DanielleErickson on 9/10/14.
 */
public class ChapterOne {

    public void printOddSum(int n){
        int total = 0;
        for(int i=1; i<=n; i=i+2){
            total+=i;
        }
        System.out.println(total);

    }

//    public void printOddSumAgain(){
//        (n/4)*n
//    }
    public static void main (String [] args){
        ChapterOne one = new ChapterOne();
        one.printOddSum(100);
    }
}
