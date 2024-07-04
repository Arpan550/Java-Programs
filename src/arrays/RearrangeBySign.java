package arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int[] arr2=new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        // Method 1: Brute force
        rearrange(arr);
        System.out.print("After rearranging: ");
        ArrayUtility.displayArray(arr);
        // Method 2: Optimal
        rearrange2(arr2);
        System.out.print("After rearranging: ");
        ArrayUtility.displayArray(arr2);
    }

    private static void rearrange2(int[] arr) {
        int posindex=0, negIndex=1;
        int[]ans=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                ans[negIndex]=arr[i];
                negIndex+=2;
            } else{
                ans[posindex]=arr[i];
                posindex+=2;
            }
        }
        System.arraycopy(ans,0,arr,0,arr.length);
    }

    private static void rearrange(int[] arr) {
        int[] pos = new int[arr.length / 2 + 1];
        int[] neg = new int[arr.length / 2 + 1];
        int posIndex = 0, negIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg[negIndex++] = arr[i];
            } else if (arr[i] > 0) {
                pos[posIndex++] = arr[i];
            }
        }

        for (int i = 0; i < posIndex; i++) {
            arr[2 * i] = pos[i];
        }

        for (int i = 0; i < negIndex; i++) {
            arr[2 * i + 1] = neg[i];
        }
    }
}
