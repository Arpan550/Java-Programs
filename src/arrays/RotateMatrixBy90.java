package arrays;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] matrix=MatrixUtility.inputMatrix();
        MatrixUtility.displayMatrix(matrix);

        // Brute force
        rotate1(matrix);

        //Optimal (in place)
        rotate2(matrix);
        System.out.println("After rotating(Optimal): ");
        MatrixUtility.displayMatrix(matrix);
    }

    private static void rotate2(int[][] matrix) {
        int n= matrix.length;

        // transpose
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse every row
        for(int i=0;i<n;i++){
            reverseArr(matrix[i]);
        }
    }

    private static void reverseArr(int[] matrix) {
        int start=0, end= matrix.length-1;
        while(start<=end){
            int temp=matrix[start];
            matrix[start]=matrix[end];
            matrix[end]=temp;
            start++;
            end--;
        }
    }

    private static void rotate1(int[][] matrix) {
        int n= matrix.length;
        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][n-1-i]=matrix[i][j];
            }
        }
        System.out.println("After rotating(Brute force): ");
        MatrixUtility.displayMatrix(arr);
    }
}
