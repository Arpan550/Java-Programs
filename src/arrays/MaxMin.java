package arrays;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,4,3,6,7,8,6};

        findMax(arr);
        findMin(arr);
    }

    private static void findMin(int[] arr) {
        // Method: 1 : By sorting
        int[] temp=arr;
        Arrays.sort(temp);
        System.out.println("Min: "+temp[0]);

        // Method 2: by using a variable
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min: "+min);
    }

    private static void findMax(int[] arr) {
        // Method: 1 : By sorting
        int[] temp=arr;
        Arrays.sort(temp);
        System.out.println("Max: "+temp[temp.length-1]);

        // Method 2: by using a variable
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Min: "+max);

    }
}
