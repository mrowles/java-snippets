package number;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.List;

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

    @Test
    public void findPrimeNumbers() {
        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        List<Integer> results = Number.findPrimeNumbers(data);

        assertEquals(2, results.get(0).intValue());
        assertEquals(3, results.get(1).intValue());
        assertEquals(5, results.get(2).intValue());
        assertEquals(7, results.get(3).intValue());
        assertEquals(11, results.get(4).intValue());
    }
}