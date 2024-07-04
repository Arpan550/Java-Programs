package arrays;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int[] arr2 = new int[arr.length];
        int[] arr3 = new int[arr.length];

        System.arraycopy(arr, 0, arr2, 0, arr.length);
        System.arraycopy(arr, 0, arr3, 0, arr.length);

        // Method 1: Brute force
        Arrays.sort(arr);
        System.out.print("The result array (Brute force): ");
        ArrayUtility.displayArray(arr);

        // Method 2: Counting method
        sort2(arr2);
        System.out.print("The result array (Counting method): ");
        ArrayUtility.displayArray(arr2);

        // Method 3: Optimal (Dutch National Flag Algorithm)
        sort3(arr3);
        System.out.print("The result array (Dutch National Flag Algorithm): ");
        ArrayUtility.displayArray(arr3);
    }

    private static void sort3(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    swap(arr, low, mid);
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                case 2 -> {
                    swap(arr, mid, high);
                    high--;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void sort2(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int value : arr) {
            if (value == 0) {
                count0++;
            } else if (value == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        Arrays.fill(arr, 0, count0, 0);
        Arrays.fill(arr, count0, count0 + count1, 1);
        Arrays.fill(arr, count0 + count1, arr.length, 2);
    }
}
