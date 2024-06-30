package basics;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int passkey=1234,pass;

        do{
            System.out.print("Enter valid password: ");
            pass=sc.nextInt();
        } while(pass!=passkey);

        System.out.println("Succesful !!");
    }
}
