package basics;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num=sc.nextInt();

        //Method 1
        int count=0, temp=num;

        while(temp!=0){
            temp/=10;
            count++;
        }

        System.out.println("No of digits in the num: "+count);

        // Method 2
        System.out.println("No of digits in the num: "+(int)(Math.log10(num)+1));

    }
}
