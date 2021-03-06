package rocks.zipcode;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

//Gregory Donnelly
public class Hangman {
    Scanner userInput = new Scanner(System.in);
    String userGuess = userInput.toString();
    String[] wordBank = {"pens", "shot", "tick", "lamp"};
    String wordStr = wordBank[randomInteger()];
    char[] wordStrArr = wordStr.toCharArray();
    char[] dashesArr = dashMaker(wordStrArr);
    boolean letterPresent = isLetterHere(userInput);
    boolean continueGame = stillWantToPlay();

    private boolean stillWantToPlay() {
        boolean stillPlaying = true;
        if (userInput.equals("-")) {
            stillPlaying = false;
            System.out.println("Goodbye");
        }
        return stillPlaying;
    }

    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.runGame();
    }

    private void runGame() {
        while (continueGame) {
            System.out.println(Display.gameDisplay());
        }
    }

    private boolean isLetterHere(Scanner userInput) {
        boolean present = false;
        for (int i = 0; i < wordStrArr.length; i++) {
            if (Objects.equals(wordStrArr[i], userInput)) {
                present = true;
            }
        }
        return present;
    }

    private char[] dashMaker(char[] wordStrArr) {
        char[] dashArrMade = wordStrArr;
        for (int i = 0; i < wordStrArr.length; i++) {
            wordStrArr[i] = '-';
        }
        return dashArrMade;
    }

    private int randomInteger() {
        int integer = (int) (Math.random() * wordBank.length);
        return integer;
    }

}
