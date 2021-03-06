package rocks.zipcode;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

//Gregory Donnelly
public class Hangman {
    String[] wordBank = {"pens", "shot", "tick", "lamp"};
    String wordStr = wordBank[randomInteger()];
    char[] wordStrArr = wordStr.toCharArray();
    char[] dashesArr = dashMaker(wordStrArr);

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
