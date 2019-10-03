package algorithms.lookAndSay;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LookAndSayTest {

    @Test
    public void testLookAndSay() {
        String expected = "1";
        String result = LookAndSay.iterative(1);
        assertEquals(expected, result);

        expected = "11";
        result = LookAndSay.iterative(2);
        assertEquals(expected, result);

        expected = "21";
        result = LookAndSay.iterative(3);
        assertEquals(expected, result);

        expected = "1211";
        result = LookAndSay.iterative(4);
        assertEquals(expected, result);

        expected = "13211311123113112211";
        result = LookAndSay.iterative(10);
        assertEquals(expected, result);
    }
}