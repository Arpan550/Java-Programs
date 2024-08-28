import java.util.Scanner;

public class SimpleCalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                Calculator
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                Choice a function: \s""");
        int option = sc.nextInt();
        switch (option) {
            case 1 -> {
                System.out.println("Enter the first value: ");
                int a = sc.nextInt();
                System.out.println("Enter the second value: ");
                int b = sc.nextInt();
                int sum = a + b;
                System.out.println("Addition: " + sum);
            }
            case 2 -> {
                System.out.println("Enter the first value: ");
                int a = sc.nextInt();
                System.out.println("Enter the second value: ");
                int b = sc.nextInt();
                int sub = a - b;
                System.out.println("Subtraction: " + sub);
            }
            case 3 -> {
                System.out.println("Enter the first value: ");
                int a = sc.nextInt();
                System.out.println("Enter the second value: ");
                int b = sc.nextInt();
                int mul = a * b;
                System.out.println("Multiplication: " + mul);
            }
            case 4 -> {
                System.out.println("Enter the first value: ");
                int a = sc.nextInt();
                System.out.println("Enter the second value: ");
                int b = sc.nextInt();
                int div = a / b;
                System.out.println("Division: " + div);
            }
            default -> System.out.println("Invalid option");
        }
    }
}
