package arrays;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();

        System.out.print("Array before sorting: ");
        ArrayUtility.displayArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Array after sorting: ");
        ArrayUtility.displayArray(arr);
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> mergedArray = new ArrayList<>();
        int i = low, j = mid + 1;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                mergedArray.add(arr[i]);
                i++;
            } else {
                mergedArray.add(arr[j]);
                j++;
            }
        }

        while (i <= mid) {
            mergedArray.add(arr[i]);
            i++;
        }
        while (j <= high) {
            mergedArray.add(arr[j]);
            j++;
        }

        for (int k = 0; k < mergedArray.size(); k++) {
            arr[low + k] = mergedArray.get(k);
        }
    }
}
