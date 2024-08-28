// A Class that represents user-defined exception
class MyException extends Exception {
    public MyException(String s) {
        // Call constructor of parent Exception
        super(s);
    }
}

// A Class that uses the above MyException
public class CustomExceptionHandling {
    // Driver Program
    public static void main(String args[]) {
        try {
            // Throw an object of the user-defined exception
            throw new MyException("GeeksGeeks");
        } catch (MyException ex) {
            System.out.println(ex);

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}
