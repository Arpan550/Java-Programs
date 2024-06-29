package basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper range: ");
        int range = sc.nextInt();

        System.out.print("Fibonacci series up to " + range + " using iterative approach: ");
        for (int i = 0; i < range; i++) {
            System.out.print(fibb1(i) + " ");
        }
        System.out.println();

        System.out.print("Fibonacci series up to " + range + " using recursive approach: ");
        for (int i = 0; i < range; i++) {
            System.out.print(fibb2(i) + " ");
        }
        System.out.println();

        sc.close();
    }

    // Iterative approach
    private static int fibb1(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int first = 0, second = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = first + second;
            first = second;
            second = fib;
        }
        return fib;
    }

    // Recursive approach
    private static int fibb2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibb2(n - 1) + fibb2(n - 2);
    }
}
