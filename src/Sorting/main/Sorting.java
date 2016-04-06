package Sorting.main;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    private int[] array;

    public Sorting(int[] array) {
        this.array = array;
    }

    /**
     * BubbleSort
     *
     * Repeatedly steps through a list and compares each pair of adjacent items and swapping them if they are in the
     * wrong order.
     *
     * Efficient: small lists
     * Inefficient: large lists
     *
     * Complexity:
     * Worst-case and average: O(n2)
     *
     */
    public String[] BubbleSort() {
        String[] passes = new String[getLength() + 1];
        int k, temp, l = 0;

        // go through the array n amount of times
        for (int m = getLength(); m >= 0; m--) {

            // go through each index of array comparing current index
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

            passes[l] = toString();
            l++;

        }

        return passes;
    }

    /**
     * SelectionSort
     *
     * Combo of searching and sorting, each pass the unsorted element with the smallest/ or largest value is moved to
     * it's proper position in the array. Inner loop finds the next smallest or largest value and the outer loop places
     * that value into it's proper location.
     *
     * Efficent: TODO
     * Inefficient: TODO
     *
     * Complexity: TODO
     *
     */
    public String[] SelectionSort() {
        String[] passes = new String[getLength() + 1];
        int index, smallestNumber, l = 0;

        for (int i = 0; i < getLength() - 1; i++) {
            index = i;

            for (int j = i + 1; j < getLength(); j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            smallestNumber = array[index];
            array[index] = array[i];
            array[i] = smallestNumber;

            passes[l] = toString();
            l++;
        }

        return passes;
    }

    /**
     * InsertionSort
     *
     * Iterates through list, consumes one element at each repetition and grows a second array. Removes from original
     * array and inserts into sorted list where it needs to be. Repeats until no elements left in original array.
     *
     * Efficient: small lists
     * Inefficient: large lists
     *
     * Complexity:
     * Best - already sorted: O(n)
     * Worst: O(n2)
     *
     */
    public String[] InsertionSort() {
        String[] passes = new String[getLength() + 1];

        int temp, l = 0;

        // Start at second index
        for (int i = 1; i < getLength(); i++) {

            // Compare with previous indexes
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }

            passes[l] = toString();
            l++;
        }

        return passes;
    }

    public List<String> callQuickSort() {
        ArrayList<String> passes = new ArrayList<String>();
        QuickSort(0, getLength() - 1, passes);
        return passes;
    }

    /**
     * QuickSort
     *
     * Divides list into two smaller sub lists, low elements and high elements, which it then recursively sort the sub
     * lists. Choose pivot element from list (generally middle index), reorder list so that all elements with less
     * value than pivot come before pivot while all values greater than pivot value come after it. Recursively apply
     * the above steps to the sub-list of elements with smaller values and separately the sub-list of elements with
     * greater values.
     *
     * Efficient:
     * Inefficient:
     *
     * Complexity:
     * Average: O (n log(n))
     * Worst: O(n2)
     *
     */
    private void QuickSort(int lowerIndex, int higherIndex, List<String> passes) {

        int temp;

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {

            // start to pivot (left hand side), find number greater than pivot
            while (array[i] < pivot) {
                i++;
            }

            // end to pivot (right hand side), find number less than pivot
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

        passes.add(toString());

        // recursively call quick sort with new indexes
        if (lowerIndex < j) {
            QuickSort(lowerIndex, j, passes);
        }

        // recursively call quick sort with new indexes
        if (i < higherIndex) {
            QuickSort(i, higherIndex, passes);
        }
    }

    private int[] tempMergeSortArray;

    public List<String> callMergeSort() {
        tempMergeSortArray = new int[getLength()];
        ArrayList<String> passes = new ArrayList<String>();
        MergeSort(0, getLength() - 1, passes);
        return passes;
    }

    /**
     * Merge Sorting
     *
     * Divide array into n partitions, each partition containing 1 element where it is considered sorted. Repeatedly
     * merge partitioned units to produce new sublists until there is only 1 sublist remaining, the list will be
     * sorted at the end.
     *
     * Efficient: TODO
     * Inefficient: TODO
     *
     * Complexity:
     * O(n*log(n))
     *
     */
    private void MergeSort(int lowerIndex, int higherIndex, List<String> passes) {

        if (lowerIndex < higherIndex) {

            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            // sorts left hand side of array
            MergeSort(lowerIndex, middle, passes);

            // sorts right hand side of array
            MergeSort(middle + 1, higherIndex, passes);


            // merge both sides
            for (int i = lowerIndex; i <= higherIndex; i++) {
                tempMergeSortArray[i] = array[i];
            }

            int i = lowerIndex;
            int j = middle + 1;
            int k = lowerIndex;

            while (i <= middle && j <= higherIndex) {
                if (tempMergeSortArray[i] <= tempMergeSortArray[j]) {
                    array[k] = tempMergeSortArray[i];
                    i++;
                } else {
                    array[k] = tempMergeSortArray[j];
                    j++;
                }
                k++;
            }

            while (i <= middle) {
                array[k] = tempMergeSortArray[i];
                k++;
                i++;
            }

            passes.add(toString());

        }
    }

    private int getLength() {
        return array.length;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < getLength(); i++) {
            result += array[i] + ", ";
        }
        return result;
    }
}
