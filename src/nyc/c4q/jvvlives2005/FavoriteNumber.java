package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/17/15.
 */
import java.util.Scanner;

public class FavoriteNumber {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in); // This is the line you need to fill in the box.
            System.out.println("Tell me your favorite number? ");
            String favNumber = keyboard.next();
            System.out.println("I love the number " + favNumber + " too!");
        }
    }

