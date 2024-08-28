import java.io.*;

public class TransposeMatrix {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ROWS =");
        int m = Integer.parseInt(br.readLine());
        System.out.println("ENTER THE NUMBER OF COLUMNS =");
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[m][n];
        System.out.println("ENTER THE ELEMENTS=");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("MATRIX IS=");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("TRANSPOSE MATRIX IS=");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j][i] + "  ");
            }
            System.out.println();
        }
    }
}
