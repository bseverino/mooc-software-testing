package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void onePair() {
        GHappy g = new GHappy();
        Boolean result = g.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void singleG() {
        GHappy g = new GHappy();
        Boolean result = g.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void onePairAndSingleG() {
        GHappy g = new GHappy();
        Boolean result = g.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void triple() {
        GHappy g = new GHappy();
        Boolean result = g.gHappy("xxgggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void shortString() {
        GHappy g = new GHappy();
        Boolean result = g.gHappy("gg");
        Assertions.assertTrue(result);
    }

    @Test
    public void singleChar() {
        GHappy g = new GHappy();
        Boolean result = g.gHappy("g");
        Assertions.assertFalse(result);
    }
}
