//1+1/2!+1/3!+1/4!.....+1/n!//
import java.io.*;

public class PositiveSeriesSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER=");
        int n = Integer.parseInt(br.readLine());
        int a = 1;
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                a = a * j;
            }
            sum = sum + (1.0 / a);
            a = 1;
        }
        System.out.println("sum of the series=" + sum);
    }
}
