import java.util.*;

public class PrimeNumberChecker2 {
    int isPrime(int n) {
        int count = 0, temp;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 2)
            temp = 1;
        else
            temp = 0;
        return temp;
    }

    public static void main(String[] args) {
        PrimeNumberChecker2 ob = new PrimeNumberChecker2();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER=");
        int n = sc.nextInt();
        int ret = ob.isPrime(n);
        if (ret == 1)
            System.out.println("PRIME NUMBER");
        else
            System.out.println("NOT A PRIME NUMBER");
    }
}
