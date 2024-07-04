package arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();

        System.out.print("Array before sorting: ");
        ArrayUtility.displayArray(arr);

        selectionSort(arr);

        System.out.print("Array after sorting: ");
        ArrayUtility.displayArray(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr, min, i);
        }
    }

    private static void swap(int[] arr, int min, int i) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
