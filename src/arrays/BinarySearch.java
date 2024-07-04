package arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the key you want to search: ");
        int key=sc.nextInt();
        int iterativeResult = binarySearchIterative(arr, 0, arr.length - 1, key);
        int recursiveResult = binarySearchRecursive(arr, 0, arr.length - 1, key);

        if (iterativeResult != -1) {
            System.out.println("Iteratively found at index: " + iterativeResult);
        } else {
            System.out.println("Key not found iteratively.");
        }

        if (recursiveResult != -1) {
            System.out.println("Recursively found at index: " + recursiveResult);
        } else {
            System.out.println("Key not found recursively.");
        }
    }

    private static int binarySearchIterative(int[] arr, int start, int end, int key) {
        while (start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                return mid;
            } else if (key<arr[mid]) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1;
    }

    static int binarySearchRecursive(int[] arr,int start,int end, int key){
        while (start<=end){
            int mid=(start+end)/2;

            if(key==arr[mid]){
                return mid;
            } else if (key<arr[mid]) {
                return binarySearchRecursive(arr,0,mid-1,key);
            } else {
                return binarySearchRecursive(arr,mid+1, end, key);
            }
        }
        return -1;
    }
}
