package arrays;

public class SecondMaxMin {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();

        System.out.println("Second max element: "+secondMax(arr));
        System.out.println("Second min element: "+secondMin(arr));
    }

    private static int secondMin(int[] arr) {
        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }

            if(arr[i]>smallest  &&  arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }

    private static int secondMax(int[] arr) {
        int largest=arr[0];
        int slargest=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
}
