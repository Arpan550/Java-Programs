package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class DeleteKey {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 8, 8, 6, 5, 4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key to delete: ");
        int key = sc.nextInt();
        sc.close();

        int newLength = deleteKey(arr, key);

        System.out.println("Array after deletion: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }

    private static int deleteKey(int[] arr, int key) {
        int n = arr.length;
        int newLength = n;

        for (int i = 0; i < newLength; i++) {
            if (arr[i] == key) {
                for (int j = i; j < newLength - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                newLength--;
                i--;
            }
        }

        return newLength;
    }
}
