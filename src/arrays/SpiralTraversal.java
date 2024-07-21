package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] matrix=MatrixUtility.inputMatrix();
        MatrixUtility.displayMatrix(matrix);

        spiraltraversal(matrix);
    }

    private static void spiraltraversal(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> ans =new ArrayList<>();
        int top=0, bottom=n-1;
        int left=0, right=m-1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.print("Traversal element: ");
        for(int element:ans){
            System.out.print(element+" ");
        }
    }
}
