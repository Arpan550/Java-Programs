package recursions;

import arrays.ArrayUtility;

public class reverseArray {

    public void reversingArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reversingArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        reverseArray solution = new reverseArray();
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        solution.reversingArray(arr, 0, arr.length - 1);

        System.out.println("\nReversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
