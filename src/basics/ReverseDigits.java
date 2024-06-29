package basics;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();

        int temp=num, rev=0;

        while(temp>0){
            rev=rev*10+(temp%10);
            temp/=10;
        }

        System.out.println("Reverse of Digits of the num "+num+" is: "+rev);
    }
}
