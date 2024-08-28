import java.io.*;

public class ArrayPalindrome2 {
    public static void main(String[] args) throws IOException {
        ArrayPalindrome2 ob = new ArrayPalindrome2();
        int temp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("ENTER THE INTEGERS");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            temp = ob.reversed(arr[i]);
            if (temp == arr[i]) {
                System.out.println("PALINDROME NUMBER =" + temp);
            }
        }
    }

    int reversed(int n) {
        int rev = 0, r;
        while (n != 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return rev;
    }
}
