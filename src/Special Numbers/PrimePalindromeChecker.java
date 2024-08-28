import java.io.*;

public class PrimePalindromeChecker {
    public int isPrime(int n) {
        int count = 0, temp = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            temp = 1;
        return temp;
    }

    public int isPalindrome(int n) {
        int ne = 0, r, p = n, temp = 0;
        while (n != 0) {
            r = n % 10;
            ne = ne * 10 + r;
            n = n / 10;
        }
        if (p == ne)
            temp = 1;
        return temp;
    }

    public void checkPrimePalindrome() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER ANY NUMBER = ");
        int m = Integer.parseInt(br.readLine());
        if (isPrime(m) == 1 && isPalindrome(m) == 1)
            System.out.println("PRIME-PALINDROME NUMBER");
        else
            System.out.println("NOT PRIME-PALINDROME NUMBER");
    }
}
