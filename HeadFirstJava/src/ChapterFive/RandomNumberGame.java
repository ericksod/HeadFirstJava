package ChapterFive;

/**
 * class to represent a game of random number guessing.
 * Created by DanielleErickson on 9/11/14.
 */
public class RandomNumberGame {
    private int randToGuess = (int) (Math.random()*100);
    private UserGuess ug = new UserGuess();

    /**
     * gets the user's guess and checks it against the correct answer. Keeps asking the
     * user for a guess until they guess correctly. Gives hints to whether they guessed
     * too high or too low.
     */
    public void manageGuess(){
        String guess = ug.getUserlnput("Please Guess a number between 1 and 100:");
        int userGuess = Integer.parseInt(guess);
        while(userGuess!=randToGuess){
            if(userGuess>randToGuess) {
                guess = ug.getUserlnput("You guessed too high! Please try again:");
            }else{
                guess = ug.getUserlnput("You guessed too low! Please try again:");
            }
            userGuess = Integer.parseInt(guess);
        }
        System.out.println("Congratulations! You guessed "+userGuess+" which was correct!");
    }

    public static void main(String [] args){
        RandomNumberGame rg = new RandomNumberGame();
        rg.manageGuess();
    }
}
