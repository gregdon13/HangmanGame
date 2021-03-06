package rocks.zipcode;

import java.util.Arrays;

public class Display extends Hangman {
    public static String[] gameDisplay(char[] dashes, int tries) {
        String howManyTries = "You have " + tries + " left";
        String[] gameScreen = {"Current Guesses:", Arrays.toString(dashes), howManyTries, "Enter a single character:"};
        return gameScreen;
    }


    public static String winningScreen() {
        String youWon = "Congrats! You win!";
        return youWon;
    }

    public static String losingScreen() {
        return "Looks like you were hanged...";
    }

    public static String playAgain() {
        return "Would you like to try again? Y or N";
    }

    public static String startupScreen() {
        return "Would you like to play a game? Y or N";
    }
}
