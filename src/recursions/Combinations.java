package recursions;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value n and r for nCr: ");
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println("Result: "+ myComb(n,r));
    }

    private static int myComb(int n, int r) {
        if(r==0 || n==r){
            return 1;
        }
        return myComb(n-1,r-1)+myComb(n-1,r);
    }
}
