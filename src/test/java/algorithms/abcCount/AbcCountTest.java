package algorithms.abcCount;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AbcCountTest {

    @Test
    public void findCombinations() {
        int expected = 3;
        int results = AbcCount.findCombinations(1);
        assertEquals(expected, results);

        expected = 8;
        results = AbcCount.findCombinations(2);
        assertEquals(expected, results);

        expected = 19;
        results = AbcCount.findCombinations(3);
        assertEquals(expected, results);

        expected = 39;
        results = AbcCount.findCombinations(4);
        assertEquals(expected, results);
    }
}