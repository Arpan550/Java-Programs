package functional_programming;

import java.util.function.BiFunction;

public class LambdaMultiplication {
    public static void main(String[] args) {
        // Lambda expression for multiplication of two integers
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Applying the lambda expression to a pair of numbers
        int num1 = 5;
        int num2 = 7;
        int result = multiply.apply(num1, num2);

        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + result);
    }
}
