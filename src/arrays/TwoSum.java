package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Method 1: O(n2)
        int[] result = findNos(arr, target);
        if (result != null) {
            System.out.println("The two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers sum up to the target value.");
        }

        // Method 2: approx O(n): hashing
        int[] result2 = findNos2(arr, target);
        if (result != null) {
            System.out.println("The two numbers are: " + result2[0] + " and " + result2[1]);
        } else {
            System.out.println("No two numbers sum up to the target value.");
        }

        // Method 3: approx O(n): two pointer approach(Works correctly on sorted array)
        int[] result3 = findNos3(arr, target);
        if (result != null) {
            System.out.println("The two numbers are: " + result3[0] + " and " + result3[1]);
        } else {
            System.out.println("No two numbers sum up to the target value.");
        }
    }

    private static int[] findNos3(int[] arr, int target) {
        int left=0, right=arr.length-1;

        while (left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return new int[]{arr[left], arr[right]};
            } else if(sum<target){
                left++;
            } else{
                right--;
            }
        }
        return null;
    }

    private static int[] findNos2(int[] arr, int target) {
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            int more=target-element;

            if(map.containsKey(more)){
                return new int[]{more, element};
            }
            map.put(element, i);
        }
        return null;
    }

    private static int[] findNos(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return null;
    }
}
