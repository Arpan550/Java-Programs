package recursions;

import java.util.Scanner;

public class PrintNTo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int N=sc.nextInt();

        printReverse(N);
    }

    private static void printReverse(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printReverse(n-1);
    }
}
