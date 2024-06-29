package basics;

import java.util.Scanner;

import static basics.GCD.gcd;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two num: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
    }

    private static int lcm(int num1, int num2) {
        int n=gcd(num1, num2);//denominator
        int m=num1*num2;//numerator

        return (m/n);
    }
}
