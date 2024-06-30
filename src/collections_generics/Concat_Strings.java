package collections_generics;

public class Concat_Strings {
    public static String concat(String... str) {
        StringBuilder result = new StringBuilder();
        for (String s : str) {
            result.append(s);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String result = concat("Hello", ", ", "this", " ", "is", " ", "a", " ", "test", ".");
        System.out.println(result);
    }
}
