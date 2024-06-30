package recursions;

import arrays.ArrayUtility;

public class CheckPalindromeArray {
    public static void main(String[] args) {
        int[] arr= ArrayUtility.inputArray();

        System.out.println(checkIsPalindrome(arr, 0, arr.length-1)?"Palindrome":"Not Palindrome");
    }

    private static boolean checkIsPalindrome(int[] arr, int start, int end) {
        if(start>=end){
            return false;
        }
        if(arr[start]!=arr[end]){
            return false;
        }
        checkIsPalindrome(arr, start+1, end-1);
        return true;
    }
}
