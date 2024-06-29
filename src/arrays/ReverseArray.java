package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();

        ArrayUtility.displayArray(arr);
        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        ArrayUtility.displayArray(arr);
    }
}
