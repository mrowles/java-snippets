package algorithms.closestPointsToOrigin;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ClosestPointsToOriginTest {

    @Test
    public void testFindClosestSort() {
        int[][] expected = new int[][]{
                new int[]{1, 2}
        };
        int[][] result = ClosestPointsToOrigin.findClosestSort(
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
        result = ClosestPointsToOrigin.findClosestSort(
                new int[][]{
                        new int[]{4, 3},
                        new int[]{9, 9}
                },
                2
        );

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindClosestDivideAndConquer() {
        ClosestPointsToOrigin closestPointsToOrigin = new ClosestPointsToOrigin();
        int[][] expected = new int[][]{
                new int[]{1, 2}
        };
        int[][] result = closestPointsToOrigin.findClosestDivideAndConquer(
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
        result = closestPointsToOrigin.findClosestDivideAndConquer(
                new int[][]{
                        new int[]{4, 3},
                        new int[]{9, 9}
                },
                2
        );

        assertArrayEquals(expected, result);
    }
}