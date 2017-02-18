package main;

import static org.junit.Assert.assertEquals;

import com.google.common.base.Stopwatch;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SortingTest {

    private Stopwatch sw;
    private Sorting sorting;
    private int[] array = {4, 2, 9, 6, -15, 23, 12, 34, 0, 1};

    @Before
    public void setup() throws Exception {
        sorting = new Sorting(array);
        sw = new Stopwatch();
    }

    @Test
    public void testBubbleSort() {
        sw.start();
        String[] passes = sorting.BubbleSort();
        sw.stop();
        System.out.println(sw.elapsedTime(TimeUnit.NANOSECONDS) + " ns - Bubble sorting runtime");

        // original ="4, 2, 9, 6, -15, 23, 12, 34, 0, 1, "
        assertEquals("2, 4, 6, -15, 9, 12, 23, 0, 1, 34, ", passes[0]);
        assertEquals("2, 4, -15, 6, 9, 12, 0, 1, 23, 34, ", passes[1]);
        assertEquals("2, -15, 4, 6, 9, 0, 1, 12, 23, 34, ", passes[2]);
        assertEquals("-15, 2, 4, 6, 0, 1, 9, 12, 23, 34, ", passes[3]);
        assertEquals("-15, 2, 4, 0, 1, 6, 9, 12, 23, 34, ", passes[4]);
        assertEquals("-15, 2, 0, 1, 4, 6, 9, 12, 23, 34, ", passes[5]);
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ", passes[6]);
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ", passes[7]); // same order
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ", passes[8]); // same order
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ", passes[9]); // same order
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ", passes[10]); // same order

        String expected = "-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ";
        assertEquals(expected, sorting.toString());
    }

    @Test
    public void testSelectionSort() {
        sw.start();
        String[] passes = sorting.SelectionSort();
        sw.stop();
        System.out.println(sw.elapsedTime(TimeUnit.NANOSECONDS) + " ns - Selection sorting runtime");

        // original ="4, 2, 9, 6, -15, 23, 12, 34, 0, 1, "
        assertEquals("-15, 2, 9, 6, 4, 23, 12, 34, 0, 1, ", passes[0]);
        assertEquals("-15, 0, 9, 6, 4, 23, 12, 34, 2, 1, ", passes[1]);
        assertEquals("-15, 0, 1, 6, 4, 23, 12, 34, 2, 9, ", passes[2]);
        assertEquals("-15, 0, 1, 2, 4, 23, 12, 34, 6, 9, ", passes[3]);
        assertEquals("-15, 0, 1, 2, 4, 23, 12, 34, 6, 9, ", passes[4]); // same order
        assertEquals("-15, 0, 1, 2, 4, 6, 12, 34, 23, 9, ", passes[5]);
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 34, 23, 12, ", passes[6]);
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ", passes[7]);
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ", passes[8]); // same order

        String expected = "-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ";
        assertEquals(expected, sorting.toString());
    }

    @Test
    public void testInsertionSort() {
        sw.start();
        String[] passes = sorting.InsertionSort();
        sw.stop();
        System.out.println(sw.elapsedTime(TimeUnit.NANOSECONDS) + " ns - Insertion sorting runtime");

        // original ="4, 2, 9, 6, -15, 23, 12, 34, 0, 1, "
        assertEquals("2, 4, 9, 6, -15, 23, 12, 34, 0, 1, ", passes[0]); // 1st = 4
        assertEquals("2, 4, 9, 6, -15, 23, 12, 34, 0, 1, ", passes[1]); // 2nd = 9
        assertEquals("2, 4, 6, 9, -15, 23, 12, 34, 0, 1, ", passes[2]); // 3rd = 6
        assertEquals("-15, 2, 4, 6, 9, 23, 12, 34, 0, 1, ", passes[3]); // 4th = -15
        assertEquals("-15, 2, 4, 6, 9, 23, 12, 34, 0, 1, ", passes[4]); // 5th = 23
        assertEquals("-15, 2, 4, 6, 9, 12, 23, 34, 0, 1, ", passes[5]); // 6th = 12
        assertEquals("-15, 2, 4, 6, 9, 12, 23, 34, 0, 1, ", passes[6]); // 7th = 34
        assertEquals("-15, 0, 2, 4, 6, 9, 12, 23, 34, 1, ", passes[7]); // 8th = 0
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ", passes[8]); // 9th = 1

        String expected = "-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ";
        assertEquals(expected, sorting.toString());
    }

    @Test
    public void testQuickSort() {
        sw.start();
        List<String> passes = sorting.callQuickSort();
        sw.stop();
        System.out.println(sw.elapsedTime(TimeUnit.NANOSECONDS) + " ns - Quick sorting runtime");

        // original ="4, 2, 9, 6, -15, 23, 12, 34, 0, 1, "
        assertEquals("-15, 2, 9, 6, 4, 23, 12, 34, 0, 1, ", passes.get(0)); // -15 was pivot
        assertEquals("-15, 2, 9, 6, 4, 1, 12, 0, 34, 23, ", passes.get(1)); // 23 was pivot
        assertEquals("-15, 2, 0, 1, 4, 6, 12, 9, 34, 23, ", passes.get(2)); // 4 was pivot
        assertEquals("-15, 0, 2, 1, 4, 6, 12, 9, 34, 23, ", passes.get(3)); // 0 was pivot
        assertEquals("-15, 0, 1, 2, 4, 6, 12, 9, 34, 23, ", passes.get(4)); // 2 was pivot
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 34, 23, ", passes.get(5)); // 12 was pivot
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 34, 23, ", passes.get(6)); // 6 was pivot - same as previous
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ", passes.get(7)); // 34 was pivot


        String expected = "-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ";
        assertEquals(expected, sorting.toString());
    }

    @Test
    public void testMergeSort() {
        sw.start();
        List<String> passes = sorting.callMergeSort();
        sw.stop();
        System.out.println(sw.elapsedTime(TimeUnit.NANOSECONDS) + " ns - Merge sorting runtime");

        // original ="4, 2, 9, 6, -15, 23, 12, 34, 0, 1, "
        assertEquals("2, 4, 9, 6, -15, 23, 12, 34, 0, 1, ", passes.get(0));
        assertEquals("2, 4, 9, 6, -15, 23, 12, 34, 0, 1, ", passes.get(1)); // same as previous
        assertEquals("2, 4, 9, -15, 6, 23, 12, 34, 0, 1, ", passes.get(2));
        assertEquals("-15, 2, 4, 6, 9, 23, 12, 34, 0, 1, ", passes.get(3));
        assertEquals("-15, 2, 4, 6, 9, 12, 23, 34, 0, 1, ", passes.get(4));
        assertEquals("-15, 2, 4, 6, 9, 12, 23, 34, 0, 1, ", passes.get(5)); // same as previous
        assertEquals("-15, 2, 4, 6, 9, 12, 23, 34, 0, 1, ", passes.get(6)); // same as previous
        assertEquals("-15, 2, 4, 6, 9, 0, 1, 12, 23, 34, ", passes.get(7));
        assertEquals("-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ", passes.get(8));

        String expected = "-15, 0, 1, 2, 4, 6, 9, 12, 23, 34, ";
        assertEquals(expected, sorting.toString());
    }
}
