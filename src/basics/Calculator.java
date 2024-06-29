package basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Select: 1.addition, 2.subtraction, 3. multiplication, 4. division, 5. modular, 6.exit");
            int op=sc.nextInt();
            if(op==6){
                break;
            }
            System.out.println("Enter two number: ");
            int a=sc.nextInt();
            int b=sc.nextInt();

            switch (op){
                case 1-> System.out.println(addition(a,b));
                case 2-> System.out.println(subtraction(a, b));
                case 3-> System.out.println(multiplication(a, b));
                case 4-> System.out.println(division(a,b));
                case 5-> System.out.println(modular(a, b));
                default -> {
                    break;
                }
            }
        }
    }

    private static int modular(int a, int b) {
        return a%b;
    }

    private static int division(int a, int b) {
        return a/b;
    }

    private static int multiplication(int a, int b) {
        return a*b;
    }

    private static int subtraction(int a, int b) {
        return a-b;
    }
    private static int addition(int a, int b) {
        return a+b;
    }
}
