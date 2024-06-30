package recursions;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of Base and Exponent: ");
        int m=sc.nextInt();
        int n=sc.nextInt();

        System.out.println(m+" to the power "+n+" is: "+exponent(m,n));
        System.out.println(m+" to the power "+n+" is: "+exponent2(m,n));
    }

    private static int exponent2(int m, int n) {
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return exponent2(m*m, n/2);
        } else{
            return m*exponent2(m*m, (n-1)/2);
        }
    }

    static int exponent(int m, int n) {
        if(n==0){
            return 1;
        }
        return m*exponent(m, n-1);
    }
}
