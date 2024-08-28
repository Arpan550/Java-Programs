//x-x/2!+x/3!-x/4!.....+-x/n!//
import java.io.*;

public class AlternateFactorialSeries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER=");
        int n = Integer.parseInt(br.readLine());
        System.out.println("ENTER A NUMBER=");
        int x = Integer.parseInt(br.readLine());
        int a = 1;
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                a = a * j;
            }
            if (i % 2 == 0)
                sum = sum - ((1.0 * x) / a);
            else
                sum = sum + ((1.0 * x) / a);
            a = 1;
        }
        System.out.println("sum of the series=" + sum);
    }
}
