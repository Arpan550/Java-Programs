package basics;

import java.util.Scanner;

public class ScoreCard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score=sc.nextInt();
        String result=score>80?"High":(score<50?"Low":"Moderate");
        System.out.println(result);
    }
}
