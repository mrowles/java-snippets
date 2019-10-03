package algorithms.sorting;

import java.util.HashMap;

/**
 * BubbleSort
 * Repeatedly steps through a list and compares each pair of adjacent items and swapping them if they are in the
 * wrong order.
 * Efficient: small lists
 * Inefficient: large lists
 * Complexity:
 * Worst-case and average: O(n2)
 */
public class BubbleSort {
    public HashMap<Integer, int[]> sort(int[] array) {
        int arrayLen = array.length;
        HashMap<Integer, int[]> passes = new HashMap<>();
        int k, temp, l = 0;

        // go through the algorithms.array n amount of times
        for (int m = arrayLen; m >= 0; m--) {

            // go through each index of algorithms.array comparing current index
            for (int i = 0; i < m - 1; i++) {

                // set k to next index
                k = i + 1;

                // perform swap if next is less than current
                if (array[i] > array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }

            passes.put(l, array.clone());
            l++;
        }

        return passes;
    }
}
