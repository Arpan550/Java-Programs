package arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovesDuplicates {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();

        // Method 1: Brute force
        Set<Integer> mySet = new LinkedHashSet<>();
        for (int element : arr) {
            mySet.add(element);
        }
        int[] unique = new int[mySet.size()];
        int index = 0;
        for (int i : mySet) {
            unique[index++] = i;
        }
        System.out.print("Array after removing duplicates using Set: ");
        ArrayUtility.displayArray(unique);


        // Method 2: Two Pointer Approach
        int length = removeDuplicates(arr);
        System.out.print("Array after removing duplicates using Two Pointer: ");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}