package patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        char flag;
        for(int i=0;i<n;i++){
            flag='A';
            for(int j=0;j<n-i;j++){
                System.out.print(flag++);
            }
            System.out.println();
        }
    }
}
