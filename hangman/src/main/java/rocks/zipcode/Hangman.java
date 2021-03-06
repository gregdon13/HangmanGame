package rocks.zipcode;

import sun.lwawt.macosx.CSystemTray;

import java.util.*;

//Gregory Donnelly
public class Hangman {
    Scanner userInput = new Scanner(System.in);
    String userGuess = userInput.toString();
    String[] wordBank = {"pens", "shot", "tick", "lamp"};
    String wordStr = wordBank[randomInteger()];
    char[] wordStrArr = wordStr.toCharArray();
    char[] dashesArr = dashMaker(wordStrArr);
    Integer numOfTries = wordStrArr.length * 2;
    boolean letterPresent = isLetterHere(userGuess);
    boolean continueGame = stillWantToPlay();
    Integer indexOfDashToReplace = 0;

    //if user wants to still play
    private boolean stillWantToPlay() {
        boolean stillPlaying = true;
        if (userGuess.equals("-")) {
            stillPlaying = false;
            System.out.println("Goodbye");
        }
        return stillPlaying;
    }

    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.runGame();
    }

    //running games
    private void runGame() {
        String welcomeScreen = Display.startupScreen();
        String[] gameUI = Display.gameDisplay(wordStrArr, numOfTries);

        System.out.println(welcomeScreen);
        if (userGuess.equalsIgnoreCase("Y")) {
            stillWantToPlay();
        } else if (userGuess.equalsIgnoreCase("N")) {
            continueGame = false;
        } else {
            System.out.println("Invalid");
            System.out.println(welcomeScreen);
        }
        while (continueGame) {
            Arrays.stream(gameUI).forEach(System.out::println);
            if (letterPresent) {
                replaceDash(wordStrArr, dashesArr, indexOfDashToReplace);
            }
            numOfTries--;
            if (wordGuessed()) {
                System.out.println(Display.winningScreen());
            } else if (numOfTries == 0) {
                System.out.println(Display.losingScreen());
            }
        }
        System.out.println(Display.playAgain());
        if (userGuess.equalsIgnoreCase("Y")) {
            runGame();
        } else if (userGuess.equalsIgnoreCase("N")) {
            System.out.println("Goodbye");
        } else {
            System.out.println("Invalid");
            System.out.println(Display.playAgain());
        }
    }

    //turns dash in dash array to matching letter of word
    private void replaceDash(char[] word, char[] dashes, int index) {
        dashes[index] = word[index];
    }

    //has word been guessed
    private boolean wordGuessed() {
        boolean isWordDone = false;
        for (int i = 0; i < dashesArr.length; i++) {
            if (dashesArr[i] == wordStrArr[i]) {
                isWordDone = true;
            } else {
                return false;
            }
        }
        return isWordDone;
    }

    //check if guess is present in array
    private boolean isLetterHere(String userInput) {
        char[] charInput = userInput.toCharArray();
        for (int i = 0; i < wordStrArr.length; i++) {
            if (wordStrArr[i] == charInput[0]) {
                indexOfDashToReplace = i;
                return true;
            }
        }
        return false;
    }

    //makes dash array
    private char[] dashMaker(char[] wordStrArr) {
        char[] dashArrMade = wordStrArr;
        Arrays.fill(wordStrArr, '-');
        return dashArrMade;
    }

    //creates random int
    private int randomInteger() {
        int integer = (int) (Math.random() * wordBank.length);
        return integer;
    }

}
