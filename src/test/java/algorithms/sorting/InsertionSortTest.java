package algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.google.common.base.Stopwatch;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class InsertionSortTest {
    @Test
    public void sort() {
        Stopwatch sw = Stopwatch.createUnstarted();
        InsertionSort insertionSort = new InsertionSort();
        int[] array = {4, 2, 9, 6, -15, 23, 12, 34, 0, 1};

        sw.start();
        HashMap<Integer, int[]> passes = insertionSort.sort(array);
        sw.stop();
        System.out.println(sw.elapsed(TimeUnit.NANOSECONDS) + " ns - Insertion algorithms.sorting runtime");

        assertEquals(9, passes.size());
        assertArrayEquals(new int[]{2, 4, 9, 6, -15, 23, 12, 34, 0, 1}, passes.get(0)); // 1st = 4
        assertArrayEquals(new int[]{2, 4, 9, 6, -15, 23, 12, 34, 0, 1}, passes.get(1)); // 2nd = 9
        assertArrayEquals(new int[]{2, 4, 6, 9, -15, 23, 12, 34, 0, 1}, passes.get(2)); // 3rd = 6
        assertArrayEquals(new int[]{-15, 2, 4, 6, 9, 23, 12, 34, 0, 1}, passes.get(3)); // 4th = -15
        assertArrayEquals(new int[]{-15, 2, 4, 6, 9, 23, 12, 34, 0, 1}, passes.get(4)); // 5th = 23
        assertArrayEquals(new int[]{-15, 2, 4, 6, 9, 12, 23, 34, 0, 1}, passes.get(5)); // 6th = 12
        assertArrayEquals(new int[]{-15, 2, 4, 6, 9, 12, 23, 34, 0, 1}, passes.get(6)); // 7th = 34
        assertArrayEquals(new int[]{-15, 0, 2, 4, 6, 9, 12, 23, 34, 1}, passes.get(7)); // 8th = 0
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 23, 34}, passes.get(8)); // 9th = 1
    }

}