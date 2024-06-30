package hashing;

import arrays.ArrayUtility;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element frequencies:  ");
        for(Map.Entry<Integer, Integer> entry: countMap.entrySet()){
            System.out.println("Element: "+entry.getKey()+"  Count: "+entry.getValue());
        }
    }
}
