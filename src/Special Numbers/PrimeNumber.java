import java.util.*;

public class PrimeNumber {
    int isprime(int n) {
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
        PrimeNumber ob = new PrimeNumber();
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER AN INTEGER =");
        int n = sc.nextInt();
        int ret = ob.isprime(n);
        if (ret == 1)
            System.out.println("PRIME NUMBER");
        else
            System.out.println("NOT A PRIME NUMBER");

        PrimeNumber ob1 = new PrimeNumber();
        System.out.println("ENTER AN INTEGER =");
        int n1 = sc.nextInt();
        ret = ob1.isprime(n1);
        if (ret == 1)
            System.out.println("PRIME NUMBER");
        else
            System.out.println("NOT A PRIME NUMBER");

        System.out.println("YOU HAVE ENTERED = " + n + " and " + n1);
    }
}
