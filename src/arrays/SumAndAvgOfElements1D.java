package arrays;

public class SumAndAvgOfElements1D {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,4,6,5,7,8};
        int sum=0;

        for(int i:arr){
            sum+=i;
        }
        System.out.println("Sum of all elements: "+ sum);
        System.out.println("Avg of all elements: "+ (sum/arr.length));
    }
}
