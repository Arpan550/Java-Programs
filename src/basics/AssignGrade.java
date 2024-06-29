package basics;

import java.util.Scanner;

public class AssignGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your mark: ");
        float mark=sc.nextFloat();
        if(mark>90){
            System.out.println("Grade: A");
        } else if(mark>75){
            System.out.println("Grade: B");
        } else if(mark>60){
            System.out.println("Grade: C");
        } else if(mark>30){
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
