package arrays;

import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the kth point of rotation: ");
        int k=sc.nextInt();
        int[] temp=new int[k];

        System.out.print("Before rotating: ");
        ArrayUtility.displayArray(arr);
        for(int i=0;i<k;i++){
            temp[i]=arr[arr.length-k+i];
        }

        for(int i=arr.length-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }

        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        System.out.print("After rotating: ");
        ArrayUtility.displayArray(arr);

    }
}
