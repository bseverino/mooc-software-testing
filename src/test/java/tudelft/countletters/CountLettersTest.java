package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountLettersTest {

    @ParameterizedTest(name = "string")
    @CsvSource({ "cats|dogs", "car|door" })
    public void multipleMatchingWords(String string) {
        int words = new CountLetters().count(string);
        Assertions.assertEquals(2, words);
    }

    @ParameterizedTest(name = "string")
    @CsvSource({ "cats|dog", "car|dog" })
    public void lastWordDoesNotMatch(String string) {
        int words = new CountLetters().count(string);
        Assertions.assertEquals(1, words);
    }

    @ParameterizedTest(name = "string")
    @CsvSource({ "cat|dog", "cat" })
    public void noMatchingWords(String string) {
        int words = new CountLetters().count(string);
        Assertions.assertEquals(0, words);
    }

}