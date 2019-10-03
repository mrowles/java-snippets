package algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.google.common.base.Stopwatch;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class BubbleSortTest {
    @Test
    public void sort() {
        Stopwatch sw = Stopwatch.createUnstarted();
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {4, 2, 9, 6, -15, 23, 12, 34, 0, 1};

        sw.start();
        HashMap<Integer, int[]> passes = bubbleSort.sort(array);
        sw.stop();
        System.out.println(sw.elapsed(TimeUnit.NANOSECONDS) + " ns - Bubble algorithms.sorting runtime");

        assertEquals(11, passes.size());
        assertArrayEquals(new int[]{2, 4, 6, -15, 9, 12, 23, 0, 1, 34}, passes.get(0));
        assertArrayEquals(new int[]{2, 4, -15, 6, 9, 12, 0, 1, 23, 34}, passes.get(1));
        assertArrayEquals(new int[]{2, -15, 4, 6, 9, 0, 1, 12, 23, 34}, passes.get(2));
        assertArrayEquals(new int[]{-15, 2, 4, 6, 0, 1, 9, 12, 23, 34}, passes.get(3));
        assertArrayEquals(new int[]{-15, 2, 4, 0, 1, 6, 9, 12, 23, 34}, passes.get(4));
        assertArrayEquals(new int[]{-15, 2, 0, 1, 4, 6, 9, 12, 23, 34}, passes.get(5));
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 23, 34}, passes.get(6));
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 23, 34}, passes.get(7)); // same order
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 23, 34}, passes.get(8)); // same order
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 23, 34}, passes.get(9)); // same order
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 23, 34}, passes.get(10)); // same order
    }

}