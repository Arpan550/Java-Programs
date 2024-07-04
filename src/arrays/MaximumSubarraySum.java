package arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();

        // Method 1: Brute force
        System.out.println("Max length subarray sum: "+ findLen(arr));
        // Method 1: Kadane's Algorithm
        System.out.println("Max length subarray sum: "+ findLen2(arr));
    }

    private static int findLen2(int[] arr) {
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }

    private static int findLen(int[] arr) {
        int sum=0,max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    max=Math.max(sum, max);
                }
            }
        }
        return max;
    }
}
