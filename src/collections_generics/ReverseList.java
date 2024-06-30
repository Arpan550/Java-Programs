package collections_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
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

        for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--){
            Collections.swap(list, i, j);
        }

        System.out.println();
        System.out.print("List after reversing: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
