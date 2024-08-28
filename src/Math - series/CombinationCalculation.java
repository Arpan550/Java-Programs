//n!/(n-r)!*r!//
import java.io.*;

public class CombinationCalculation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE VALUE OF n =");
        int n = Integer.parseInt(br.readLine());
        System.out.println("ENTER THE VALUE r =");
        int r = Integer.parseInt(br.readLine());
        double a = 1.0, b = 1.0;
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        for (int j = 1; j <= r; j++) {
            b = b * j;
        }
        sum = a / ((a - b) * b);

        System.out.println("sum of the series=" + sum);
    }
}
