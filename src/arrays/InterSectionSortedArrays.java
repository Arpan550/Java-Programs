package arrays;

import java.util.Arrays;

public class InterSectionSortedArrays {
    public static void main(String[] args) {
        int[] arr1=ArrayUtility.inputArray();
        int[] arr2=ArrayUtility.inputArray();

        intersectionByTwopointer(arr1, arr2);
    }

    private static void intersectionByTwopointer(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] intersection = new int[Math.min(m, n)];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                intersection[k++] = arr1[i];
                i++;
                j++;
            }
        }

        intersection = Arrays.copyOf(intersection, k);

        // Display arrays
        System.out.print("Array1: ");
        ArrayUtility.displayArray(arr1);
        System.out.print("Array2: ");
        ArrayUtility.displayArray(arr2);
        System.out.print("Intersection Array: ");
        ArrayUtility.displayArray(intersection);
    }
}
