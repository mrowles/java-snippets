package algorithms.levenshteinDistance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LevenshteinDistanceTest {
    @Test
    public void recursive() {
        int expected = 0;
        int result = LevenshteinDistance.recursive("cat", "cat");
        assertEquals(expected, result);

        expected = 3;
        result = LevenshteinDistance.recursive("cat", "");
        assertEquals(expected, result);

        expected = 2;
        result = LevenshteinDistance.recursive("cat", "tac");
        assertEquals(expected, result);

        // @todo
        // words longer than 10 chars make this algo chug! must fix
    }

    @Test
    public void memoization() {
        int expected = 0;
        int result = LevenshteinDistance.memoization("cat", "cat");
        assertEquals(expected, result);

        expected = 3;
        result = LevenshteinDistance.memoization("cat", "");
        assertEquals(expected, result);

        expected = 2;
        result = LevenshteinDistance.memoization("cat", "tac");
        assertEquals(expected, result);

        expected = 18;
        result = LevenshteinDistance.memoization("The Russian Revolution", "Revolution Russian The");
        assertEquals(expected, result);
    }
}