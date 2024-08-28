import java.io.*;

public class DiagonalSums {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ROWS or COLUMN =");
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][n];
        System.out.println("ENTER THE ELEMENTS=");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("MATRIX IS=");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        int leftDiagonalSum = 0, rightDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            leftDiagonalSum += arr[i][i];
        }

        for (int j = 0; j < n; j++) {
            rightDiagonalSum += arr[j][n - 1 - j];
        }
        System.out.println("SUM OF LEFT DIAGONAL=" + leftDiagonalSum);
        System.out.println("SUM OF RIGHT DIAGONAL=" + rightDiagonalSum);
    }
}
