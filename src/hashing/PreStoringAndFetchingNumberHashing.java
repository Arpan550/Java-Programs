package hashing;

import arrays.ArrayUtility;

import java.util.Scanner;

public class PreStoringAndFetchingNumberHashing {
    public static void main(String[] args) {

        int[] arr= ArrayUtility.inputArray();
        int[] hashArr=new int[13];

        for(int i=0;i<arr.length;i++){
            hashArr[arr[i]]+=1;
        }

        System.out.print("Array: ");
        ArrayUtility.displayArray(arr);
        System.out.print("Hashed Array: ");
        ArrayUtility.displayArray(hashArr);
    }
}
