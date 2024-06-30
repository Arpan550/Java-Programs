package patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        char flag='E';
        for(int i=0;i<n;i++){
            for(char ch = (char) ('E'-i); ch<='E'; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
