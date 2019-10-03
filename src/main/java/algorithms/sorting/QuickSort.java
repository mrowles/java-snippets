package algorithms.sorting;

import java.util.HashMap;

/**
 * QuickSort
 * Divides list into two smaller sub lists, low elements and high elements, which it then recursively sort the sub
 * lists. Choose pivot element from list (generally middle index), reorder list so that all elements with less
 * value than pivot come before pivot while all values greater than pivot value come after it. Recursively apply
 * the above steps to the sub-list of elements with smaller values and separately the sub-list of elements with
 * greater values.
 * Efficient:
 * Inefficient:
 * Complexity:
 * Average: O (n log(n))
 * Worst: O(n2)
 */
public class QuickSort {
    public HashMap<Integer, int[]> sort(int[] array) {
        HashMap<Integer, int[]> passes = new HashMap<>();
        quickSort(array, 0, array.length - 1, passes);

        return passes;
    }

    private void quickSort(int[] array, int lowerIndex, int higherIndex, HashMap<Integer, int[]> passes) {
        int temp;
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {

            // start to pivot (left hand side), find algorithms.number greater than pivot
            while (array[i] < pivot) {
                i++;
            }

            // end to pivot (right hand side), find algorithms.number less than pivot
            while (array[j] > pivot) {
                j--;
            }

            // swap numbers
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        passes.put(passes.size(), array.clone());

        // recursively call quick sort with new indexes
        if (lowerIndex < j) {
            quickSort(array, lowerIndex, j, passes);
        }

        // recursively call quick sort with new indexes
        if (i < higherIndex) {
            quickSort(array, i, higherIndex, passes);
        }
    }
}
