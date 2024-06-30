package OOPs;

import java.util.Scanner;

public class Circle {
    double radiusinMm;

    Circle(double radiusinMm){
        this.radiusinMm=radiusinMm;
    }

    double getCircumference(){
        return 2*radiusinMm*Math.PI;
    }

    double getArea(){
        return Math.PI*Math.pow(radiusinMm, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radiusinMm=" + radiusinMm +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius in Mm: ");
        double rad=sc.nextDouble();

        Circle circle=new Circle(rad);
        System.out.println("Circumference: "+circle.getCircumference());
        System.out.println("Area: "+circle.getArea());
    }
}
