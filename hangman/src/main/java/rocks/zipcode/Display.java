package rocks.zipcode;

import java.util.Arrays;

public class Display extends Hangman {
    public static String[] gameDisplay() {
        String[] gameScreen = {"Current Guesses:", Arrays.toString(char[] dashesArr)};
    }
}
