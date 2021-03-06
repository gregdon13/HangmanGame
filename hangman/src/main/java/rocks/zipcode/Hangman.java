package rocks.zipcode;

import java.util.Scanner;
import java.util.Random;

// Gregory Donnelly
public class Hangman {
    String[] randomWords = {"pin", "help", "split", "stumpy"};
    RanInt dashesLength = new RanInt();
    Integer numOfTries = randomWords[dashesLength.ranInteger()].length();
    RandWord randWord = new RandWord();



    public void main(String[] args) {
        Hangman game = new Hangman();
        game.runGame();
    }

    public void runGame() {
        char[] wordPicked = randWord.randWordPicker();
        char[] dashesInitialized = randWord.dashesChar();
        Integer triesTaken = numOfTries;
        Display display = new Display();

        boolean wordGuessed = false;
        while (numOfTries > 0 && !wordGuessed) {
            display.userDisplayInGame(numOfTries, dashesInitialized);
            if (Character.isLetter()) {

            }
        }
    }

    public Hangman() {
    }

}
