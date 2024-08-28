import java.io.*;

public class ArrayPalindrome {
    public static void main(String[] args) throws IOException {
        ArrayPalindrome ob = new ArrayPalindrome();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("ENTER THE INTEGERS");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ob.reversed(arr[i]));
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
