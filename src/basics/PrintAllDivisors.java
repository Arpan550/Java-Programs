package basics;

import java.util.Scanner;

public class PrintAllDivisors {
    static long sumOfFactor(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter: ");
        int N=sc.nextInt();
        long sum=0, sum2=0;

        //Method 1
        for(int i=1;i<=N;i++){
            sum+=sumOfFactor(i);
        }
        System.out.println("Sum of all factors of each number from 1 to "+N+" is: "+sum);

        //Method 2
        for(int i=1;i<=N;i++){
            sum2+=(N/i)*i;
        }
        System.out.println("Sum of all factors of each number from 1 to "+N+" is: "+sum2);
    }
}
