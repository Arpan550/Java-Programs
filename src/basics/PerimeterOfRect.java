package basics;

import java.util.Scanner;

public class PerimeterOfRect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width and height of the rectangle:");
        double width=sc.nextDouble();
        double height=sc.nextDouble();

        System.out.println("Perimeter: "+2*(width+height));
    }
}
