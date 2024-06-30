package hashing;

import arrays.ArrayUtility;

import java.util.Scanner;

public class PreStoringAndFetchingCharacterHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String myStr=sc.next().toLowerCase();

        int[] hashArr=new int[26];
        for(int i=0;i<myStr.length();i++){
            hashArr[myStr.charAt(i)-'a']+=1;
        }

        System.out.println("String: "+myStr);
        System.out.print("HashedArray: ");
        ArrayUtility.displayArray(hashArr);
    }
}
