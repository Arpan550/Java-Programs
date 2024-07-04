package arrays;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();

        // Method1: O(n^2)
        int majorityElement1 = findMajorityElement(arr);
        if (majorityElement1 != -1) {
            System.out.println("Majority element (Method 1): " + majorityElement1);
        } else {
            System.out.println("No majority element found (Method 1)");
        }

        // Method2: O(n) using HashMap
        int majorityElement2 = findMajorityElement2(arr);
        if (majorityElement2 != -1) {
            System.out.println("Majority element (Method 2): " + majorityElement2);
        } else {
            System.out.println("No majority element found (Method 2)");
        }

        // Method3: O(n) but more efficient : Boyer Moore's Voting algorithm
        int majorityElement3 = findMajorityElement3(arr);
        if (majorityElement3 != -1) {
            System.out.println("Majority element (Method 3): " + majorityElement3);
        } else {
            System.out.println("No majority element found (Method 3)");
        }
    }

    private static int findMajorityElement3(int[] arr) {
        int count=0, el=0;

        for(int i=0;i<arr.length;i++){
            if(count==0){
                count=1;
                el=arr[i];
            } else if(arr[i]==el){
                count++;
            } else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(el==arr[i]){
                count1++;
            }
        }
        if(count1>(arr.length)/2){
            return el;
        }
        return -1;
    }

    private static int findMajorityElement(int[] arr) {
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    private static int findMajorityElement2(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (map.get(num) > arr.length / 2) {
                return num;
            }
        }
        return -1;
    }
}
