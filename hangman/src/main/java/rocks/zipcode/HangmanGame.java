package rocks.zipcode;

public class HangmanGame {


    public void runGame() {
        RanWord randomWord = new RanWord();
        String[] gameArray = randomWord.ranWordFromListChars();
        String displayDashes = randomWord.makeDashDisplay();
        Integer attemptCount = gameArray.length * 2;

        String[] userDisplay = {"", "", "", ""};
        userDisplay[0] = "Current Guesses:";
        userDisplay[1] = displayDashes;
        userDisplay[2] = "You have " + attemptCount + " tries left";
        userDisplay[3] = "Enter a single letter";


        while (attemptCount > 0) {
            for (int i = 0; i < userDisplay.length; i++) {
                System.out.println(userDisplay[i]);
            }
        }
    }

}
