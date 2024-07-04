package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionSortedArrays {
    public static void main(String[] args) {
        int[] arr1=ArrayUtility.inputArray();
        int[] arr2=ArrayUtility.inputArray();

        unionBySet(arr1, arr2);
        unionByTwoPointer(arr1, arr2);
    }

    private static void unionByTwoPointer(int[] arr1, int[] arr2) {
        int m=arr1.length;
        int n=arr2.length;

        int[] union=new int[m+n];
        int i=0,j=0,k=0;

        while (i<m && j<n){
            if(arr1[i]<arr2[j]){
                union[k++]=arr1[i++];
            } else if(arr1[i]>arr2[j]){
                union[k++]=arr2[j++];
            } else{
                union[k++]=arr1[i++];
                j++;
            }
        }

        while (i<m){
            union[k++]=arr1[i++];
        }
        while (j<n){
            union[k++]=arr2[j++];
        }
        union= Arrays.copyOf(union,k);
        System.out.print("Array1: ");
        ArrayUtility.displayArray(arr1);
        System.out.print("Array2: ");
        ArrayUtility.displayArray(arr2);
        System.out.print("Union Array: ");
        ArrayUtility.displayArray(union);

    }

    private static void unionBySet(int[] arr1, int[] arr2) {
        Set<Integer> mySet=new HashSet<>();

        for(int i:arr1){
            mySet.add(i);
        }
        for(int i:arr2){
            mySet.add(i);
        }
        int[] unique=new int[mySet.size()];
        int index=0;
        for(int element:mySet){
            unique[index++]=element;
        }
        System.out.print("Array1: ");
        ArrayUtility.displayArray(arr1);
        System.out.print("Array2: ");
        ArrayUtility.displayArray(arr2);
        System.out.print("Union Array: ");
        ArrayUtility.displayArray(unique);
    }
}
