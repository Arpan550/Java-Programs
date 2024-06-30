package functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilterConcatenate {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "apple", "banana", "cherry", "date", "elderberry",
                "fig", "grapefruit", "honeydew", "jackfruit", "kiwifruit"
        );

        // Filter strings with length >= 10 and concatenate them
        String result = stringList.stream()
                .filter(s -> s.length() >= 10)
                .collect(Collectors.joining(", "));

        System.out.println("Concatenated result: " + result);
    }
}

