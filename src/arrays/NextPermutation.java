package arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();

        System.out.print("Array:: ");
        ArrayUtility.displayArray(arr);
        System.out.print("Next permutation of the array is:: ");
        nextPermutation(arr);
        ArrayUtility.displayArray(arr);
    }

    private static void nextPermutation(int[] arr) {
        int n = arr.length;

        // step 1: find the first decreasing element from the end
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // If there is no decreasing element, the array is the last permutation. Reverse it to get the first permutation.
        if (index == -1) {
            reverseArray(arr, 0, n - 1);
            return;
        }

        // step 2: find the next greater element from the end
        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swapArray(arr, i, index);
                break;
            }
        }

        // step 3: reverse the array from index + 1 to end
        reverseArray(arr, index + 1, n - 1);
    }

    private static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            swapArray(arr, start, end);
            start++;
            end--;
        }
    }
}
