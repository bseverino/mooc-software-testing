package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "message")
    @CsvSource({ "UPPERCASE", "12345", "$&*%()@" })
    public void invalidCharacters(String message) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(message, 1);
        Assertions.assertEquals("invalid", result);
    }

    @Test
    public void noWrap() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("abcdef", 5);
        Assertions.assertEquals("fghijk", result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, expectedResult={2}")
    @CsvSource({ "abc, -1, zab", "xyz, 1, yza" })
    public void wrapAround(String message, int shift, String expectedResult) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
