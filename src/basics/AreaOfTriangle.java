package basics;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and height of the triangle: ");
        double base=sc.nextDouble();
        double height=sc.nextDouble();

        System.out.println("Area: "+0.5*base*height);
    }
}
