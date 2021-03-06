package rocks.zipcode;

import java.util.Scanner;

public class Display {
    Scanner userInput = new Scanner(System.in);
    String character = in.next();

    public void startupScreen() {
        System.out.println("Do you want to play a game?");
        System.out.println("Y for yes and N for no");
        userInput.nextLine();
    }

    public void userDisplayInGame(Integer numTries, char[] dashes) {
        System.out.println("Current Guesses:");
        System.out.println(dashes);
        System.out.println("You have " + numTries + " tries left");
        System.out.println("Enter a single letter");
       userInput.nextLine();
    }


}
