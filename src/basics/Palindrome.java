package basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=sc.nextInt();

        int rev=0, temp=num;

        while(temp>0){
            rev=rev*10+(temp%10);
            temp/=10;
        }

        if(rev==num){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not palindrome");
        }
    }
}
