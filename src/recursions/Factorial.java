package recursions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n=sc.nextInt();

        System.out.println("Factorial of "+n+" is: "+myFact(n));
    }

    static int myFact(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return myFact(n-1)*n;
    }
}
