package ChapterSix;

import ChapterFive.UserInput;

import java.util.ArrayList;

/**
 *
 * class to represent a game of random number guessing.
 * Created by DanielleErickson on 9/11/14.
 */
public class RandomNumGame {
    private int randToGuess = (int) (Math.random()*100);
    private UserInput ug = new ChapterFive.UserInput();
    private ArrayList<String> allGuesses = new ArrayList<String>();

    /**
     * gets the user's guess and checks it against the correct answer. Keeps asking the
     * user for a guess until they guess correctly. Gives hints to whether they guessed
     * too high or too low. It also keeps a record of all the guesses the user has made
     * and prints them out once the user guesses correctly.
     */
    public void manageGuess(){
        String guess = ug.getUserlnput("Please Guess a number between 1 and 100:");
        allGuesses.add(guess);
        int userGuess = Integer.parseInt(guess);
        while(userGuess!=randToGuess){
            if(userGuess>randToGuess) {
                guess = ug.getUserlnput("You guessed too high! Please try again:");
            }else{
                guess = ug.getUserlnput("You guessed too low! Please try again:");
            }
            allGuesses.add(guess);
            userGuess = Integer.parseInt(guess);
        }

        System.out.println("Congratulations! You guessed "+userGuess+" which was correct!");
        System.out.println("Guess history: "+allGuesses.toString());
    }

    public static void main(String [] args){
        RandomNumGame rg = new RandomNumGame();
        rg.manageGuess();
    }
}
