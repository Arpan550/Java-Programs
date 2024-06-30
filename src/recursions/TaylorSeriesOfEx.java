package recursions;

import java.util.Scanner;

public class TaylorSeriesOfEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of terms: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.println("Taylor series summation value of e^x is: " + taylor(n, x));
    }

    private static double taylor(int n, int x) {
        if (n == 0) {
            return 1;
        }
        return (exponent(x, n) / myFact(n)) + taylor(n - 1, x);
    }

    private static double exponent(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * exponent(x, n - 1);
    }

    private static double myFact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * myFact(n - 1);
    }
}
