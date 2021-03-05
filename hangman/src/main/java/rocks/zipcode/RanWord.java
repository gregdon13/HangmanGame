package rocks.zipcode;

//Picks a word from list and makes character array. That character array is used to create the dash array
//based on how long the character array is.


public class RanWord  {

    public char[] ranWordFromListChars () {
        String[] randomWords = {"pin", "help", "split", "stumpy"};
        Integer randInt = getRandomNumber(0, randomWords.length);
        String randStr = randomWords[randInt];
        char[] charArrStr = randStr.toCharArray();
        return charArrStr;
    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public char[] makeDashDisplay() {
        char[] dashes = ranWordFromListChars();
        for (int i = 0; i < dashes.length; i++) {
            dashes[i] = '-';
        }
        return dashes;
    }
}
