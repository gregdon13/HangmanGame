package rocks.zipcode;

import java.util.Scanner;
import java.util.Random;

//Gregory Donnelly
public class Hangman {
    String[] wordBank = {"pens", "shot", "tick", "lamp"};
    String wordStr = wordBank[randomInteger()];

    private int randomInteger() {
        int integer = (int) (Math.random() * wordBank.length);
        return integer;
    }

}
