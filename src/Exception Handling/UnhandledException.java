public class UnhandledException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero, will throw ArithmeticException
        }
        catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e);
        }
    }
}
