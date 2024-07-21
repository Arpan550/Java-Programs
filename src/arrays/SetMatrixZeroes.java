package arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = MatrixUtility.inputMatrix();
        int[][] matrix2 = MatrixUtility.copyMatrix(matrix);
        int[][] matrix3 = MatrixUtility.copyMatrix(matrix);

        System.out.println("Original Matrix: ");
        MatrixUtility.displayMatrix(matrix);

        // Method 1: Brute force
        setMatrix(matrix);
        System.out.println("Resultant Matrix (Brute force): ");
        MatrixUtility.displayMatrix(matrix);

        // Method 2: Better approach
        setMatrix2(matrix2);
        System.out.println("Resultant Matrix (Better approach): ");
        MatrixUtility.displayMatrix(matrix2);

        // Optimal approach
        setMatrix3(matrix3);
        System.out.println("Resultant Matrix (Optimal approach): ");
        MatrixUtility.displayMatrix(matrix3);
    }

    private static void setMatrix3(int[][] matrix3) {
        int row=matrix3.length;
        int col=matrix3[0].length;
        int col0=1;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix3[i][j]==0){
                    matrix3[i][0]=0;
                    if(j!=0){
                        matrix3[0][j]=0;
                    } else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix3[i][j]!=0){
                    if(matrix3[i][0]==0 || matrix3[0][j]==0){
                        matrix3[i][j]=0;
                    }
                }
            }
        }
        if(matrix3[0][0]==0){
            for(int j=0;j<col;j++){
                matrix3[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<row;i++){
                matrix3[i][0]=0;
            }
        }
    }

    private static void setMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, i);
                    markCol(matrix, j);
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void setMatrix2(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] rowM = new int[row];
        int[] colM = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    rowM[i] = 1;
                    colM[j] = 1;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rowM[i] == 1 || colM[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void markCol(int[][] matrix, int j) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    private static void markRow(int[][] matrix, int i) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }
}
