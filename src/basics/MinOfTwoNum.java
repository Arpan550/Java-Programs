package basics;

import java.util.Scanner;

public class MinOfTwoNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two num: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int min= n1<n2? n1:n2;
        System.out.println("Min: "+min);
    }
}
