package basics;

import java.util.Scanner;

public class NumberGuessingGameFixedNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int secretKey=42, guess;

        do{
            System.out.println("Guess a number");
            guess=sc.nextInt();

            if(guess<secretKey){
                System.out.println("Too low!! Guess correct number..");
            } else if(guess>secretKey){
                System.out.println("Too high!! Guess correct number..");
            } else{
                System.out.println("Congratulations!! You have guessed the correct number..");
            }
        } while(guess!=secretKey);
    }
}
