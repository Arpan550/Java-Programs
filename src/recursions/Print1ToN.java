package recursions;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int N=sc.nextInt();

        printNos(N);
    }

    private static void printNos(int n) {
        if(n==0){
            return;
        }
        printNos(n-1);
        System.out.print(n+" ");
    }
}
