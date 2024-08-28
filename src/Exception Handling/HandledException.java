public class HandledException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero, will throw ArithmeticException
        }
        catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e);
        }
    }
}
