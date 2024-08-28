import java.io.*;

public class MatrixCategory {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE SIZE OF MATRIX= ");
        int n = Integer.parseInt(br.readLine());
        int val;
        int lower = 1, upper = 1;
        System.out.println("ENTER THE ELEMENTS = ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                val = Integer.parseInt(br.readLine());
                if (i > j && val != 0)
                    upper = 0;
                if (i < j && val != 0)
                    lower = 0;
            }
        }
        if (upper == 1 && lower == 1)
            System.out.println("2");
        else if (upper == 1)
            System.out.println("1");
        else if (lower == 1)
            System.out.println("-1");
        else
            System.out.println("0");
    }
}
