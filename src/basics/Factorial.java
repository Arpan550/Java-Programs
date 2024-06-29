package basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        int fact=1;

        // Method 1: Iteration approach
        int temp=num;
        while(temp>0){
            fact=fact*temp;
            temp--;
        }
        System.out.println("Factorial of "+num+" is: "+fact+ " (Iterative approach)");

        // Method 2: Recursion approach
        System.out.println("factorial of "+num+" is: "+findFact(num)+ " (Recursive approach)");
    }

    private static int findFact(int num) {
        if(num==0 ||num==1){
            return 1;
        }
        return num*findFact(num-1);
    }
}
