package rocks.zipcode;

public class RandWord extends Hangman {

    public char[] randWordPicker() {
        char[] randWord = randomWords[numOfTries].toCharArray();
        return randWord;
    }

    public char[] dashesChar() {
        char[] dashesArr = randWordPicker();
        for (int i = 0; i < dashesArr.length; i++) {
            dashesArr[i] = '-';
        }
        return dashesArr;
    }

}
