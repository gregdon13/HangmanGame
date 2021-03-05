package rocks.zipcode;

public class HangmanGame {


    public void runGame() {
        RanWord randomWord = new RanWord();
        char[] gameArray = randomWord.ranWordFromListChars();
        char[] displayDashes = randomWord.makeDashDisplay();
        Integer attemptCount = gameArray.length * 2;
    }

}
