// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main class to test the user-defined exception
public class CustomExceptionExample {
    // Method that simulates setting user age
    public static void setAge(int age) throws CustomException {
        if (age < 0) {
            throw new CustomException("Age cannot be negative");
        }
        System.out.println("Age set to: " + age);
    }

    // Main method
    public static void main(String[] args) {
        try {
            setAge(-5); // Trying to set a negative age
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }
}
