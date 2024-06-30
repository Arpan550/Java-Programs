package collections_generics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique=new HashSet<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your string: ");
        String mystr=sc.nextLine();

        for(Character ch:mystr.toCharArray()){
            unique.add(ch);
        }

        System.out.printf("Unique Character in the string: %d", unique.size());
    }
}
