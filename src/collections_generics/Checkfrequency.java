package collections_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Checkfrequency {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
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

        System.out.print("List: ");
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Frequency of the num 2 is: "+ Collections.frequency(list, 2));
    }
}
