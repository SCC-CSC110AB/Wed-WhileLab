package wed.whilelab;

import java.util.Scanner;

/**
 *
 * @author john
 */
public class WedWhileLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isUserFinished = false;
        Scanner keyboard = new Scanner(System.in);
        String userInput;
        
        while(!isUserFinished) {
            System.out.println("What's your favorite animal?");
            System.out.println("A\tDog");
            System.out.println("B\tCat");
            System.out.println("C\tCow");
            System.out.println("Q\tQuit");
            
            userInput = keyboard.nextLine();
            
            if (userInput.equalsIgnoreCase("a")) {
                System.out.println("Woof woof!");
            } else if (userInput.equalsIgnoreCase("b")) {
                System.out.println("Meow. Purr.");
            } else if (userInput.equalsIgnoreCase("c")) {
                System.out.println("Moooooo");
            } else if (userInput.equalsIgnoreCase("q")) {
                isUserFinished = true;
            } else {
                System.out.println("That's not a choice!");
            }
        }
    }
    
}
