package arrays;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,2,4,5,6,7,8,6,3};

        if(isSortedIncreasing(arr) || isSortedDecreasing(arr)){
            System.out.println("Sorted");
        } else{
            System.out.println("Unsorted");
        }
    }

    private static boolean isSortedIncreasing(int[] arr) {
        if(arr==null || arr.length<=1){
            return true;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    private static boolean isSortedDecreasing(int[] arr) {
        if(arr==null || arr.length<=1){
            return true;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
