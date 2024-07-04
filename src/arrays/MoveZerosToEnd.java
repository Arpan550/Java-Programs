package arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        int[] arr2=ArrayUtility.inputArray();

        bruteForce(arr);
        twoPointerApproach(arr2);
    }

    private static void twoPointerApproach(int[] arr) {
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
        ArrayUtility.displayArray(arr);
    }

    private static void swap(int[]arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static void bruteForce(int[] arr) {
        List<Integer> temp=new ArrayList<>();

        for(int element:arr){
            if(element!=0){
                temp.add(element);
            }
        }
        for(int i=0;i<temp.size();i++){
            arr[i]=temp.get(i);
        }
        for(int i=temp.size();i<arr.length;i++){
            arr[i]=0;
        }
        System.out.print("Now array: ");
        ArrayUtility.displayArray(arr);
    }
}
