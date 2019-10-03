package algorithms.sorting;

import java.util.HashMap;

/**
 * InsertionSort
 * Iterates through list, consumes one element at each repetition and grows a second algorithms.array. Removes from original
 * algorithms.array and inserts into sorted list where it needs to be. Repeats until no elements left in original algorithms.array.
 * Efficient: small lists
 * Inefficient: large lists
 * Complexity:
 * Best - already sorted: O(n)
 * Worst: O(n2)
 */
public class InsertionSort {
    public HashMap<Integer, int[]> sort(int[] array) {
        int arrayLen = array.length;
        HashMap<Integer, int[]> passes = new HashMap<>();

        int temp, l = 0;

        // Start at second index
        for (int i = 1; i < arrayLen; i++) {

            // Compare with previous indexes
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }

            passes.put(l, array.clone());
            l++;
        }

        return passes;
    }
}
