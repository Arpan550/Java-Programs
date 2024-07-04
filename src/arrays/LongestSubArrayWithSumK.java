package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();

        System.out.print("Enter the value of k: ");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();

        // Approach 1: O(n3)
        System.out.println("Max length of the subarray with summation k: "+findMaxLenSubArray(arr,k));
        // Approach 2: O(n2)
        System.out.println("Max length of the subarray with summation k: "+findMaxLenSubArray2(arr,k));
        // Approach 3: O(n): Optimized for positive+zero
        System.out.println("Max length of the subarray with summation k: "+findMaxLenSubArray3(arr,k));
        // Approach 3: O(n): Optimized for positive+negative
        System.out.println("Max length of the subarray with summation k: "+findMaxLenSubArray4(arr,k));
    }

    private static int findMaxLenSubArray4(int[] arr, int k) {
        int left=0, right=0, maxLen=0, n=arr.length, sum=arr[0];

        while(right<n){
            while (left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen, right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxLen;
    }

    private static int findMaxLenSubArray3(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen=0,sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }

            if(map.containsKey(sum-k)){
                maxLen=Math.max(maxLen, i-map.get(sum-k));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    private static int findMaxLenSubArray2(int[] arr, int k) {
        int maxLen=0,sum;

        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    maxLen=Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }

    private static int findMaxLenSubArray(int[] arr, int d) {
        int maxLen=0;
        int sum;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==d){
                    maxLen=Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
}
