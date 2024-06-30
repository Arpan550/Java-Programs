package functional_programming;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringArrayToStream {
    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};

        // Convert array to stream
        Stream<String> stream = Arrays.stream(stringArray);

        // Print each element of the stream to the console
        stream.forEach(System.out::println);

        stream.close();
    }
}
