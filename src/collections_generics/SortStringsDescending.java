package collections_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringsDescending {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");

        // Custom comparator to sort strings in descending order
        Comparator<String> descendingComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };

        // Sort the list using the custom comparator
        Collections.sort(strings, descendingComparator);

        // Method 2
        // Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));

        // Print the sorted list
        System.out.println(strings);
    }
}
