package algorithms.sorting;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.google.common.base.Stopwatch;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class MergeSortTest {
    @Test
    public void sort() {
        Stopwatch sw = Stopwatch.createUnstarted();
        MergeSort mergeSort = new MergeSort();
        int[] array = {4, 2, 9, 6, -15, 23, 12, 34, 0, 1};

        sw.start();
        HashMap<Integer, int[]> passes = mergeSort.sort(array);
        sw.stop();
        System.out.println(sw.elapsed(TimeUnit.NANOSECONDS) + " ns - Merge algorithms.sorting runtime");

        assertEquals(9, passes.size());
        assertArrayEquals(new int[]{2, 4, 9, 6, -15, 23, 12, 34, 0, 1}, passes.get(0));
        assertArrayEquals(new int[]{2, 4, 9, 6, -15, 23, 12, 34, 0, 1}, passes.get(1)); // same as previous
        assertArrayEquals(new int[]{2, 4, 9, -15, 6, 23, 12, 34, 0, 1}, passes.get(2));
        assertArrayEquals(new int[]{-15, 2, 4, 6, 9, 23, 12, 34, 0, 1}, passes.get(3));
        assertArrayEquals(new int[]{-15, 2, 4, 6, 9, 12, 23, 34, 0, 1}, passes.get(4));
        assertArrayEquals(new int[]{-15, 2, 4, 6, 9, 12, 23, 34, 0, 1}, passes.get(5)); // same as previous
        assertArrayEquals(new int[]{-15, 2, 4, 6, 9, 12, 23, 34, 0, 1}, passes.get(6)); // same as previous
        assertArrayEquals(new int[]{-15, 2, 4, 6, 9, 0, 1, 12, 23, 34}, passes.get(7));
        assertArrayEquals(new int[]{-15, 0, 1, 2, 4, 6, 9, 12, 23, 34}, passes.get(8));
    }
}
