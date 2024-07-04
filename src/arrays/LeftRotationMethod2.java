package arrays;

import java.util.Scanner;


public class LeftRotationMethod2 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();

        System.out.print("Enter the kth point of rotation: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.print("Before rotation: ");
        ArrayUtility.displayArray(arr);
        leftRotate(arr, k);
    }

    private static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0) {
            return;
        }
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
        System.out.print("After rotation: ");
        ArrayUtility.displayArray(arr);
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
