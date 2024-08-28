public class MultipleTryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 3: " + numbers[3]); // ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        }

        try {
            String str = null;
            System.out.println("Length of string: " + str.length()); // NullPointerException
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e);
        }

        try {
            int result = Integer.parseInt("abc"); // NumberFormatException
            System.out.println("Parsed integer: " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Number format exception: " + e);
        }
    }
}
