package arrays;

import java.util.Scanner;

/**
 * Basic Template class for array operations
 * */
public class ArrayUtility {
    /**
     * For handling input operations
     * */
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }
    /**
     * For handling display operations
     * */
    public static void displayArray(int[] arr){
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
