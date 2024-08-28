import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();

        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Orange");

        System.out.println("Elements in the ArrayList:");
        for (String element : myArrayList) {
            System.out.println(element);
        }
    }
}
