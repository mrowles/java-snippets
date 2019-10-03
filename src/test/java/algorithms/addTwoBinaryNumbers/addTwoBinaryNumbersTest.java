package algorithms.addTwoBinaryNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class addTwoBinaryNumbersTest {
    @Test
    public void addTwoBinaryNumbers() {
        String expected = "1";
        String result = AddTwoBinaryNumbers.addTwoBinaryNumbers("1", "0");
        assertEquals(expected, result);

        expected = "1101";
        result = AddTwoBinaryNumbers.addTwoBinaryNumbers("100", "1001");
        assertEquals(expected, result);

        expected = "11111111";
        result = AddTwoBinaryNumbers.addTwoBinaryNumbers("10011001", "1100110");
        assertEquals(expected, result);
    }
}