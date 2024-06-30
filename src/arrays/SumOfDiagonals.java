package arrays;

public class SumOfDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int sum_main_diag = 0, sum_second_diag = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum_main_diag += matrix[i][i];
            sum_second_diag += matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Sum of the main diagonal: " + sum_main_diag);
        System.out.println("Sum of the secondary diagonal: " + sum_second_diag);

        // subtracting the intersecting point between two diagonal
        sum_second_diag -= matrix[matrix.length / 2][matrix.length / 2];
        System.out.println("Sum of all diagonals: " + (sum_main_diag + sum_second_diag));
    }
}
