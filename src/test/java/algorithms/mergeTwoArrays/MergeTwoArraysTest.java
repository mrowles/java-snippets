package algorithms.mergeTwoArrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeTwoArraysTest {
    @Test
    public void merge() {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr3 = new int[arr1.length + arr2.length];

        new MergeTwoArrays().merge(arr1, arr2, arr3);

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, arr3);
    }
}