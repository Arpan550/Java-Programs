package OOPs;

public abstract class Shape {
    public abstract double calculateArea();
}

class Circle2 extends Shape{
    private double radiusInCms;

    public Circle2(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    public double getRadiusInCms() {
        return radiusInCms;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms, 2);
    }
}

class Square extends Shape{
    private final double sideInCms;

    Square(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideInCms, 2);
    }
}

class Test{
    public static void main(String[] args) {
        Circle2 circle = new Circle2(5.0);
        Square square = new Square(4.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
    }
}


