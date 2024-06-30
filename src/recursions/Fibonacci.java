package recursions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of term: ");
        int term=sc.nextInt();

        System.out.print("Fibonacci series upto "+term+" terms: ");
        for(int i=0;i<term;i++){
            System.out.print(myFibb(i)+" ");
        }
    }

    private static int myFibb(int n) {
        if(n==0|| n==1){
            return n;
        }
        return myFibb(n-1)+myFibb(n-2);
    }
}
