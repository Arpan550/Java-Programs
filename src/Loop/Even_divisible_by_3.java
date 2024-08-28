// Consider First n even numbers starting from zero(0) and 
// calculate sum of all the numbers divisible by 3 from 0 to n. Print the sum.
import java.util.Scanner;
public class Even_divisible_by_3 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int n=sc.nextInt();
            int sum=0;
            int var=0;
            for(int i=0;i<=n;i++)
            {
                var=2*(i-1);
                if(var%3==0)
                {
                    sum+=var;
                }
            }
            System.out.println("Sum of nth numbers : "+sum);
        }
    }
}
