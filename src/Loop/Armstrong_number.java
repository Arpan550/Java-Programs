//  to check whether the number is an Armstrong number or not.
// A positive number is called an Armstrong number if it is equal 
// to the sum of cubes of its digits for example 153 = 1^3+5^3+3^3, 370, 371, 407, etc.
// store the output(1 or 0) in result variable.
import java.util.Scanner;
import java.lang.Math; // not necessary
public class Armstrong_number 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter the number : ");
            int n=sc.nextInt();
            int result=0;
            int remainder,temp,count=0,i;
		    temp=n;
		    while(temp!=0)
		    {
			    temp/=10;
			    count++;
		    }
		    i=count;
		    temp=n;
		    while(count>0)
		    {
			    remainder=temp%10;
			    result += Math.pow(remainder, i);
			    temp/=10;
			    count--;
		    }
		    if(n==result)
			    result=1;
		    else
			    result=0;
		    System.out.print("The Number is : "+result);
        }
    }
}
