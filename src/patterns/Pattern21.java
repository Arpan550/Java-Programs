package patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        upperHalf3(n);
        lowerHalf3(n);
    }

    private static void lowerHalf3(int n) {
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*(i+1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void upperHalf3(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*n-2-(2*i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
