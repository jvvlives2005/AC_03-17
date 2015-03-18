package nyc.c4q.jvvlives2005;

import java.util.Scanner;

/** HangMan Exercise
 * Created by c4q-joshelynvivas on 3/17/15.
 */
public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecretWord sw = new SecretWord("hello");
        sw.set('H');
        System.out.println(sw.toString());
        System.out.println("You are playing HANGMAN.");

        //Start a while loop that exits till the game is over.
        //use the method on secret word to eliminate the letters

        //create a drawing that shows that if the letter is guess wrong, then a drawing should pop in

        //have user input a letter and have some loop compare the letter to the secret word
        //if the word is correct, then have the word pop up on the line; set it
        // if the word is incorrect, then have indicate the the letter is wrong and pop up a drawing
        // once the 7 chances are drawn, the game is over

        /*while (true){
            System.out.println("Type in a CAPITAL letter:");
            .next();
        }
        if (correct.sw) {
            sw.set(char letter);

        }
        else if (incorrect.sw){
             System.out.println(drawing);
        }
        else return;  */
    }
}