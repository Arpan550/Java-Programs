package basics;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two num: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("Sum of "+n1 +" and "+n2+" is: "+(n1+n2));
    }
}
