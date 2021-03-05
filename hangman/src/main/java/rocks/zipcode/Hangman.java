package rocks.zipcode;

import java.util.Scanner;
import java.util.Random;

// Gregory Donnelly
public class Hangman {
    public String ranWordFromList () {
        String[] randomWords = {"help", "book", "cash", "dome", "kelp", "drum", "pint", "mash", "roam"};
        Integer randInt = Math.random() * ((randomWords.length) - 0 + 1) + 0;
        String randWord = randomWords[randInt];
        System.out.println(randWord);
        return randWord;
    }
}
