package rocks.zipcode;

import java.util.Locale;
import java.util.Scanner;

public class Console {

    public static String input(String userInput) {
        Scanner scanInput = new Scanner(System.in);
        String temp = scanInput.nextLine();
        temp.toUpperCase(Locale.ROOT);
        return temp;
    }

}
