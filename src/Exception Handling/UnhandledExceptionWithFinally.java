public class UnhandledExceptionWithFinally {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0; // Division by zero, will throw ArithmeticException
        }
        catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e);
        }
        finally {
            // This block will be executed whether exception occurs or not
            System.out.println("Finally block executed");
        }
    }
}
