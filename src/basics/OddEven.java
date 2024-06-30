package basics;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num=sc.nextInt();

        method_by_mod(num);
        method_by_bitwise_op(num);
        method_by_ternary_op(num);
    }

    private static void method_by_ternary_op(int num) {
        boolean even=num%2==0?true:false;
        if(even){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }

    private static void method_by_bitwise_op(int num) {
        if((num&1)==1){
            System.out.println("Odd");
        } else{
            System.out.println("Even");
        }
    }

    private static void method_by_mod(int num) {
        if(num%2==0){
            System.out.printf("Even");
        } else{
            System.out.println("Odd");
        }
    }
}
