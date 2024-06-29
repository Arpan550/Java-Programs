package basics;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two num: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));

    }

    static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
