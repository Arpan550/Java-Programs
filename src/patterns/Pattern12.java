package patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int flag=1;

        for(int i=0;i<n;i++){
            if(i%2!=0){
                flag=0;
            } else{
                flag=1;
            }
            for(int j=0;j<=i;j++){
                System.out.print(flag);
                if(flag==0){
                    flag=1;
                } else{
                    flag=0;
                }
            }
            System.out.println();
        }

    }
}
