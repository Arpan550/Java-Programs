package basics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=sc.nextInt();
        sc.close();
        int temp=num, sum=0;

        int noOfDigits=findNoOfDigits(num);

        while(temp>0){
            sum+=Math.pow((temp%10), noOfDigits);
            temp/=10;
        }
        if(sum==num){
            System.out.println("Armstrong");
        } else{
            System.out.println("Not Armstrong");
        }
    }

    private static int findNoOfDigits(int num) {
        int count;
        for(count=0;num!=0;count++,num/=10);
        return count;
    }
}
