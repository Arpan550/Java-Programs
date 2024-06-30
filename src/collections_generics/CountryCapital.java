package collections_generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> capitalC = new HashMap<>();
        capitalC.put("India", "New Delhi");
        capitalC.put("England", "London");
        capitalC.put("US", "Washington");
        capitalC.put("Japan", "Tokyo");
        capitalC.put("Russia", "Moscow");
        capitalC.put("France", "Paris");
        capitalC.put("Italy", "Rome");

        System.out.print("Enter the country name: ");
        String countryName = sc.next();

        if (capitalC.containsKey(countryName)) {
            System.out.println("Capital of " + countryName + " is: " + capitalC.get(countryName));
        } else{
            System.out.println("Capital of " + countryName + " Not found.");
        }
    }
}
