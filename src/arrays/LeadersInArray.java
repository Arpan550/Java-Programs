package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();

        System.out.println("Leaders :"+findLeader(arr));
        System.out.println("Leaders :"+findLeader2(arr));
    }

    private static List<Integer> findLeader2(int[] arr) {
        int max=Integer.MIN_VALUE;
        List<Integer> ans=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
            }
            max=Math.max(max, arr[i]);
        }
        return ans;
    }

    private static List<Integer> findLeader(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        boolean leader;

        for(int i=0;i<arr.length;i++){
            leader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader==true){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
