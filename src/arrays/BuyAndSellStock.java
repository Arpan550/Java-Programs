package arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();

        int maxProfit=0,min=arr[0];

        for(int i=1;i<arr.length;i++){
            int cost=arr[i]-min;
            maxProfit=Math.max(maxProfit, cost);
            min=Math.min(min, arr[i]);
        }
        System.out.println("Max Profit: "+maxProfit);
    }
}
