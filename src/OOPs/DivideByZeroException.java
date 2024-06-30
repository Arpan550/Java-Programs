package OOPs;

import java.util.Scanner;

public class DivideByZeroException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two num: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException ae) {
            if (ae.getMessage().equals("/ by zero")) {
                System.out.println("B can't be zero");
            } else{
                throw ae;
            }
        }
    }
}
