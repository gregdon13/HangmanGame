package rocks.zipcode;

import java.util.Scanner;
import java.util.Random;

// Gregory Donnelly
public class Hangman {

    public void main(String[] args) {
        HangmanGame game = new HangmanGame();
        game.runGame();
    }


}


/*
    //creates char[] placeholder of dashes equal to length of ranWordFromListChars()
    public char[] userPlaceholderDashes () {
        char[] dashes = [ranWordFromListChars().length];
        for (int i = 0; i < dashes.length; i++) {
            dashes[i] = '-';
        }
        return dashes;
    }

    // Creates an integer for starting number of guesses player has
    public Integer numOfGuesses() {
        Integer guesses = ranWordFromListChars().length;
        return guesses;
    }

    //creates char[] of random string from String[]
    // Move
    public char[] ranWordFromListChars () {
        String[] randomWords = {"pin", "help", "split", "stumpy"};
        Integer randInt = Math.random() * ((randomWords.length) - 0 + 1) + 0;
        String randStr = randomWords[randInt];
        System.out.println(randStr);
        char[] charArrStr = randStr.toCharArray();
        System.out.println(charArrStr);
        return charArrStr;
    }
*/
