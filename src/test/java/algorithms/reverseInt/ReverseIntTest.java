package algorithms.reverseInt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntTest {
    @Test
    public void reverseInt() {
        int expected = 1337;
        int result = ReverseInt.reverseInt(7331);
        assertEquals(expected, result);

        expected = 1;
        result = ReverseInt.reverseInt(1);
        assertEquals(expected, result);

        expected = 101;
        result = ReverseInt.reverseInt(101);
        assertEquals(expected, result);

        expected = 1;
        result = ReverseInt.reverseInt(1000);
        assertEquals(expected, result);

        expected = 6666661;
        result = ReverseInt.reverseInt(1666666);
        assertEquals(expected, result);
    }
}