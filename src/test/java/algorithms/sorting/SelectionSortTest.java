package algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.google.common.base.Stopwatch;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class SelectionSortTest {
    @Test
    public void sort() {
        Stopwatch sw = Stopwatch.createUnstarted();
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {4, 2, 9, 6, -15, 23, 12, 34, 0, 1};

        sw.start();
        HashMap<Integer, int[]> passes = selectionSort.sort(array);
        sw.stop();
        System.out.println(sw.elapsed(TimeUnit.NANOSECONDS) + " ns - Selection algorithms.sorting runtime");

        assertEquals(9, passes.size());
        assertArrayEquals(new int[]{-15, 2, 9, 6, 4, 23, 12, 34, 0, 1}, passes.get(0));
        assertArrayEquals(new int[]{-15, 0, 9, 6, 4, 23, 12, 34, 2, 1}, passes.get(1));
        assertArrayEquals(new int[]{-15, 0, 1, 6, 4, 23, 12, 34, 2, 9}, passes.get(2));
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 23, 12, 34, 6, 9}, passes.get(3));
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 23, 12, 34, 6, 9}, passes.get(4)); // same order
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 12, 34, 23, 9}, passes.get(5));
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 34, 23, 12}, passes.get(6));
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 23, 34}, passes.get(7));
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 23, 34}, passes.get(8)); // same order
    }
}