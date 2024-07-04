package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MissingNumber1toN {
    public static void main(String[] args) {
        // [1,2,3,4], length=5, missing=5
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int N=sc.nextInt();
        int[] arr=ArrayUtility.inputArray();

        System.out.println("Missing number: "+missingNum(arr, N));
        System.out.println("Missing number: "+missingNum2(arr, N));
        System.out.println("Missing number: "+missingNum3(arr, N));
        System.out.println("Missing number: "+missingNum4(arr, N));
    }

    // Xor
    private static int missingNum4(int[] arr, int N) {
        int xor1=0, xor2=0;

        for(int i=0;i<N-1;i++){
            xor1=xor1^(i+1);
            xor2=xor2^arr[i];
        }

        xor1=xor1^N;
        int ans=xor1^xor2;

        if(ans==0){
            return -1;
        }
        return ans;
    }

    // Summation approach
    private static int missingNum3(int[] arr, int N) {
        int sum=0;
        int newSum=0;

        for(int i=1;i<=N;i++){
            sum+=i;
        }
        for(int i:arr){
            newSum+=i;
        }
        int ans=sum-newSum;
        if(ans!=0){
            return ans;
        }
        return -1;
    }

    // Hashmap
    private static int missingNum2(int[] arr, int N) {
        Map<Integer, Boolean> tempMap=new HashMap<>();

        for(int i:arr){
            tempMap.put(i,true);
        }

        for(int i=1;i<=N;i++){
            if(!tempMap.containsKey(i) || !tempMap.get(i)){
                return i;
            }
        }
        return -1;
    }

    // Brute force
    private static int missingNum(int[] arr, int N) {
        for(int i=1;i<=arr.length;i++){
            int flag=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }
}
