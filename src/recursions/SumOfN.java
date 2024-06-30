package recursions;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N=sc.nextInt();

//        // Iteration
//        int sum=0;
//        for(int i=1;i<=N;i++){
//            sum+=i;
//        }

//        // Direct Formula
//        System.out.println((N*(N+1))/2);

        System.out.println("Sum of "+N+" natural numbers: "+sumN(N));
    }

    private static int sumN(int n) {
        if(n==0){
            return 0;
        }
        return sumN(n-1)+n;
    }
}
