package algorithms.mergeTwoArrays;

public class MergeTwoArrays {
    public void merge(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;

        int n1 = arr1.length;
        int n2 = arr2.length;

        while (i < n1 && j < n2) {
            arr3[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        }

        while (i < n1) {
            arr3[k++] = arr1[i++];
        }

        while (j < n2) {
            arr3[k++] = arr2[j++];
        }
    }
}
