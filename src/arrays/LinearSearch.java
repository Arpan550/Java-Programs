package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter search key element: ");
        int key=sc.nextInt();

        int found=linearSearch(arr, key);
        if(found!=-1){
            System.out.println("Found at index "+found);
        } else{
            System.out.println("Not found");
        }
    }

    private static int linearSearch(int[] arr, int key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
