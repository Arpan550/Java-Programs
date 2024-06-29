package arrays;

import java.util.Scanner;

public class NoOfOccurrences {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,2,4,5,3,6,7,8};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element: ");
        int key=sc.nextInt();
        sc.close();
        int count=0;

        for(int element:arr){
            if(element==key){
                count++;
            }
        }

        System.out.println("No of occurrence of "+key+" is: "+count);
    }
}
