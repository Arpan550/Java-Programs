package arrays;

public class SumAndAvgOfElements2D {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                sum+=matrix[i][j];
            }
        }
        double avg=(double)sum/(matrix.length * matrix[0].length);

        System.out.println("Sum of all elements: "+sum+"\nAvg: "+avg);
    }
}
