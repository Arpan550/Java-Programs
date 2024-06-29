package basics;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        
        if(age>60){
            System.out.println("Senior");
        } else if (age>20) {
            System.out.println("Adult");
        } else if(age>13){
            System.out.println("Teen");
        } else{
            System.out.println("Child");
        }
    }
}
