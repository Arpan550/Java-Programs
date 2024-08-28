import java.util.Scanner;

public class PrimeNumberChecker {
    int isPrime(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        PrimeNumberChecker ab = new PrimeNumberChecker();
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER AN INTEGER = ");
        int n = sc.nextInt();
        int ret = ab.isPrime(n);

        if (ret == 1) {
            System.out.println("PRIME NUMBER");
        } else {
            System.out.println("NOT A PRIME NUMBER");
        }
    }
}
