package arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int[] row:matrix){
            ArrayUtility.displayArray(row);
        }

        int target=5;

        if(isFound(matrix, target)){
            System.out.println("Target "+target+" found");
        } else{
            System.out.println("Target "+target+" not found");
        }
    }

    private static boolean isFound(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
