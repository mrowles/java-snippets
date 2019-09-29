package threesum;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ThreeSumTest {

    @Test
    public void testLoop() {
        int[] expected = new int[]{4, 4, 2};
        int[] result = ThreeSum.loop(new int[]{4, 4, 2}, 10);

        assertArrayEquals(expected, result);

        expected = new int[]{4, 4, 2};
        result = ThreeSum.loop(new int[]{4, 4, 4, 4, 4, 4, 4, 4, 2}, 10);

        assertArrayEquals(expected, result);

        expected = new int[]{4, 5, 1};
        result = ThreeSum.loop(new int[]{4, 4, 4, 4, 5, 4, 4, 4, 1}, 10);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testHashing() {
        int[] expected = new int[]{4, 4, 2};
        int[] result = ThreeSum.hashing(new int[]{4, 4, 2}, 10);

        assertArrayEquals(expected, result);

        expected = new int[]{4, 4, 2};
        result = ThreeSum.hashing(new int[]{4, 4, 4, 4, 4, 4, 4, 4, 2}, 10);

        assertArrayEquals(expected, result);

        expected = new int[]{4, 5, 1};
        result = ThreeSum.hashing(new int[]{4, 4, 4, 4, 5, 4, 4, 4, 1}, 10);

        assertArrayEquals(expected, result);
    }
}