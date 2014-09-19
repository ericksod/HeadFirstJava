package ChapterFive;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * class to get the user's guess.
 * Created by DanielleErickson on 9/11/14.
 */
public class UserGuess {
    /**
     * method to get input from the user and returns it.
     * @param prompt
     * @return
     */
    public String getUserlnput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine. length () == 0 ) return null;
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }
        System.out.println(inputLine);
        return inputLine;
    }

    public static void main(String [] args){
        UserGuess ug = new UserGuess();
        ug.getUserlnput("Type Something");
    }
}

