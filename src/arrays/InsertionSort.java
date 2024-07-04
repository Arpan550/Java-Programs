package arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();

        ArrayUtility.displayArray(arr);
        insertionSort(arr);
        ArrayUtility.displayArray(arr);
    }

    private static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            insert(arr, i);
        }
    }

    private static void insert(int[] arr, int i) {
        int key=arr[i];
        int j=i-1;

        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
}
