package collections_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElementsInList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);

        System.out.print("List before swapping: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Swapping 1st and last element
        int temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);

        System.out.print("List after swapping: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
