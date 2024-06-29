package arrays;

public class IsPalindrome {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        ArrayUtility.displayArray(arr);

        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);

        for(int i=0,j=temp.length-1;i<temp.length/2;i++,j--){
            int third=temp[i];
            temp[i]=temp[j];
            temp[j]=third;
        }
        ArrayUtility.displayArray(temp);

        if(isPalindrome(arr, temp)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        }
    }

    private static boolean isPalindrome(int[] arr, int[] temp) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=temp[i]){
                return false;
            }
        }
        return true;
    }
}
