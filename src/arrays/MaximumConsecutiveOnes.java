package arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        // [1,0,1,1,0,1,1,1,0] -> 3
        int[] arr=ArrayUtility.inputArray();

        int count=0, max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(count,max);
            } else{
                count=0;
            }
        }
        System.out.println("Max consecutive ones is: "+max);
    }
}
