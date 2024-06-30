package patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int flag=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(flag++ +" ");
            }
            System.out.println();
        }
    }
}
