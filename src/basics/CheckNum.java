package basics;

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num" );
        double num=sc.nextDouble();
        if(num>0){
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        } else{
            System.out.println("Zero");
        }
    }
}
