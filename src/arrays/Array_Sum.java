// write a program that calculate the sum of array elements
public class Array_Sum {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int sum=0,avg=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum : "+sum);
        avg=sum/arr.length;
        System.out.println("Avg : "+avg);
    }
}
