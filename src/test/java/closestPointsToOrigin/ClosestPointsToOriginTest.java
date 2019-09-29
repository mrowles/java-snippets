package closestPointsToOrigin;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ClosestPointsToOriginTest {

    @Test
    public void testSort() {
        int[][] expected = new int[][]{
                new int[]{1, 2}
        };
        int[][] result = ClosestPointsToOrigin.sort(
                new int[][]{
                        new int[]{1, 2},
                        new int[]{2, 3},
                        new int[]{4, 3},
                        new int[]{9, 9}
                },
                1
        );

        assertArrayEquals(expected, result);

        expected = new int[][]{
                new int[]{4, 3},
                new int[]{9, 9},
        };
        result = ClosestPointsToOrigin.sort(
                new int[][]{
                        new int[]{4, 3},
                        new int[]{9, 9}
                },
                2
        );

        assertArrayEquals(expected, result);
    }

}