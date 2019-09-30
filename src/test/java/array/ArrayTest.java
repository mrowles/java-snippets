package array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayTest {

    @Test
    public void testSpiral() {
        int[][] expected = new int[][]{
                new int[]{1, 2, 3, 4},
                new int[]{12, 13, 14, 5},
                new int[]{11, 16, 15, 6},
                new int[]{10, 9, 8, 7}
        };
        int[][] result = Array.spiral(4);
        assertArrayEquals(expected, result);

        expected = new int[][]{
                new int[]{1}
        };
        result = Array.spiral(1);
        assertArrayEquals(expected, result);

        expected = new int[][]{
                new int[]{1, 2, 3, 4, 5, 6, 7, 8},
                new int[]{28, 29, 30, 31, 32, 33, 34, 9},
                new int[]{27, 48, 49, 50, 51, 52, 35, 10},
                new int[]{26, 47, 60, 61, 62, 53, 36, 11},
                new int[]{25, 46, 59, 64, 63, 54, 37, 12},
                new int[]{24, 45, 58, 57, 56, 55, 38, 13},
                new int[]{23, 44, 43, 42, 41, 40, 39, 14},
                new int[]{22, 21, 20, 19, 18, 17, 16, 15},
        };
        result = Array.spiral(8);
        assertArrayEquals(expected, result);
    }
}