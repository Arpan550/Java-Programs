package recursions;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter how many times you want to print: ");
        int time=sc.nextInt();

        printName(name, time);
    }

    private static void printName(String name, int time) {
        if(time==0){
            return;
        }
        printName(name, time-1);
        System.out.println(name);
    }
}
