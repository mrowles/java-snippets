package number;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberTest {

    @Test
    public void reverseInt() {
        int expected = 1337;
        int result = Number.reverseInt(7331);
        assertEquals(expected, result);

        expected = 1;
        result = Number.reverseInt(1);
        assertEquals(expected, result);

        expected = 101;
        result = Number.reverseInt(101);
        assertEquals(expected, result);

        expected = 1;
        result = Number.reverseInt(1000);
        assertEquals(expected, result);

        expected = 6666661;
        result = Number.reverseInt(1666666);
        assertEquals(expected, result);
    }
}