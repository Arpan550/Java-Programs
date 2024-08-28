class CustomException1 extends Exception {
    public CustomException1(String message) {
        super(message);
    }
}

public class ThrowsExample {
    public static void validate(int age) throws CustomException1 {
        if (age < 18) {
            throw new CustomException1("Age is less than 18, not eligible");
        } else {
            System.out.println("Welcome to the party!");
        }
    }

    public static void main(String[] args) {
        try {
            validate(15);
        } catch (CustomException1 e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}
