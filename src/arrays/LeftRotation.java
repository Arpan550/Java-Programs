package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the kth point of rotation: ");
        int k=sc.nextInt();
        int[] temp=new int[k];

        System.out.print("Before rotating: ");
        ArrayUtility.displayArray(arr);
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }

        for(int i=arr.length-k;i<arr.length;i++){
            arr[i]=temp[i-(arr.length-k)];
        }
        System.out.print("After rotating: ");
        ArrayUtility.displayArray(arr);

    }
}
