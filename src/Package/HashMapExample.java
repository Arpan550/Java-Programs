import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(1, "Java");
        myHashMap.put(2, "Python");
        myHashMap.put(3, "JavaScript");

        System.out.println("Value at key 1: " + myHashMap.get(1));
        System.out.println("Value at key 3: " + myHashMap.get(3));

        System.out.println("Key-Value pairs in the HashMap:");
        for (Integer key : myHashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + myHashMap.get(key));
        }
    }
}
