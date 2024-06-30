package patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            for (int j = 0; j < 2*n-2-2*i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j+1);
            }

            System.out.println();
        }
    }
}
