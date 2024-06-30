package basics;

import java.util.Scanner;

public class AbstractValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();

        int result=num>=0?num:-num;
        System.out.println(result);
    }
}
