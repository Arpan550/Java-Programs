package patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            int mid=(2*i+1)/2;
            char flag='A';
            for(int j=0;j<2*i+1;j++){
                System.out.print(flag);
                if(j<mid){
                    flag++;
                } else{
                    flag--;
                }
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
