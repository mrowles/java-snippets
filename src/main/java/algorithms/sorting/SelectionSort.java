package algorithms.sorting;

import java.util.HashMap;

/**
 * SelectionSort
 * Combo of searching and algorithms.sorting, each pass the unsorted element with the smallest/or largest value is moved to
 * it's proper position in the algorithms.array. Inner loop finds the next smallest or largest value and the outer loop places
 * that value into it's proper location.
 * Efficient: TODO
 * Inefficient: TODO
 * Complexity: TODO
 */
public class SelectionSort {
    public HashMap<Integer, int[]> sort(int[] array) {
        int arrayLen = array.length;

        HashMap<Integer, int[]> passes = new HashMap<>();
        int index, smallestNumber, l = 0;

        for (int i = 0; i < arrayLen - 1; i++) {
            index = i;

            for (int j = i + 1; j < arrayLen; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            smallestNumber = array[index];
            array[index] = array[i];
            array[i] = smallestNumber;

            passes.put(l, array.clone());
            l++;
        }

        return passes;
    }
}
