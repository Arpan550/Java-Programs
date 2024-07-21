package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();

        ArrayUtility.displayArray(arr);

        // Method 1 : Brute force
        System.out.println("Longest consecutive sequence (Brute force): " + LCS(arr));

        // Method 2 : Better
        System.out.println("Longest consecutive sequence (Optimized): " + LCS2(arr));
    }

    private static int LCS2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : arr) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    private static int LCS(int[] arr) {
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 1;
            while (linearSearch(arr, x + 1)) {
                x += 1;
                count += 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    private static boolean linearSearch(int[] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                return true;
            }
        }
        return false;
    }
}
