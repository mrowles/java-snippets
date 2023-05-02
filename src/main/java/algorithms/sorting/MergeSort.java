package algorithms.sorting;

import java.util.HashMap;

/**
 * Merge Sorting
 * Divide algorithms.array into n partitions, each partition containing 1 element where it is considered sorted. Repeatedly
 * merge partitioned units to produce new sub-lists until there is only 1 sublist remaining, the list will be
 * sorted at the end.
 * Efficient: TODO
 * Inefficient: TODO
 * Complexity:
 * O(n*log(n))
 */
public class MergeSort {
    private int[] tempArray;

    public HashMap<Integer, int[]> sort(int[] array) {
        tempArray = new int[array.length];
        HashMap<Integer, int[]> passes = new HashMap<>();
        mergeSort(array, 0, array.length - 1, passes);

        return passes;
    }

    private void mergeSort(int[] array, int lowerIndex, int higherIndex, HashMap<Integer, int[]> passes) {
        if (lowerIndex < higherIndex) {

            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            // sorts left hand side of algorithms.array
            mergeSort(array, lowerIndex, middle, passes);

            // sorts right hand side of algorithms.array
            mergeSort(array, middle + 1, higherIndex, passes);


            // merge both sides
            for (int i = lowerIndex; i <= higherIndex; i++) {
                tempArray[i] = array[i];
            }

            int i = lowerIndex;
            int j = middle + 1;
            int k = lowerIndex;

            while (i <= middle && j <= higherIndex) {
                if (tempArray[i] <= tempArray[j]) {
                    array[k] = tempArray[i];
                    i++;
                } else {
                    array[k] = tempArray[j];
                    j++;
                }
                k++;
            }

            while (i <= middle) {
                array[k] = tempArray[i];
                k++;
                i++;
            }

            passes.put(passes.size(), array.clone());
        }
    }
}
