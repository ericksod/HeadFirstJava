package ChapterSix;

import ChapterFive.UserGuess;

import java.util.ArrayList;

/**
 * Created by DanielleErickson on 9/11/14.
 */
public class RandomNumGame {
    private int randToGuess = (int) (Math.random()*100);
    private UserGuess ug = new UserGuess();
    private ArrayList<String> allGuesses = new ArrayList<String>();

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
