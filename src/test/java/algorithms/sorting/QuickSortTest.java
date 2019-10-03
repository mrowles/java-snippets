package algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.google.common.base.Stopwatch;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class QuickSortTest {
    @Test
    public void sort() {
        Stopwatch sw = Stopwatch.createUnstarted();
        QuickSort quickSort = new QuickSort();
        int[] array = {4, 2, 9, 6, -15, 23, 12, 34, 0, 1};

        sw.start();
        HashMap<Integer, int[]> passes = quickSort.sort(array);
        sw.stop();
        System.out.println(sw.elapsed(TimeUnit.NANOSECONDS) + " ns - Quick algorithms.sorting runtime");

        assertEquals(8, passes.size());
        assertArrayEquals(new int[]{-15, 2, 9, 6, 4, 23, 12, 34, 0, 1}, passes.get(0)); // -15 was pivot
        assertArrayEquals(new int[]{-15, 2, 9, 6, 4, 1, 12, 0, 34, 23}, passes.get(1)); // 23 was pivot
        assertArrayEquals(new int[]{-15, 2, 0, 1, 4, 6, 12, 9, 34, 23}, passes.get(2)); // 4 was pivot
        assertArrayEquals(new int[]{-15, 0, 2, 1, 4, 6, 12, 9, 34, 23}, passes.get(3)); // 0 was pivot
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 12, 9, 34, 23}, passes.get(4)); // 2 was pivot
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 34, 23}, passes.get(5)); // 12 was pivot
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 34, 23}, passes.get(6)); // 6 was pivot - same as previous
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 23, 34}, passes.get(7)); // 34 was pivot
    }
}