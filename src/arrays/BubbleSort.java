package arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();

        ArrayUtility.displayArray(arr);

        bubbleSort(arr);
        ArrayUtility.displayArray(arr);
    }

    private static void bubbleSort(int[] arr) {
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int min, int i) {
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
}
