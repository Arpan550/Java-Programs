package basics;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();

        if(year%400==0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("LeapYear");
        } else{
            System.out.println("Not a leap year");
        }
    }
}