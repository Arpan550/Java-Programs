//x-x/2!+x/3!-x/4!+-x/n://

import java.io.*;

public class SeriesCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER n: ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("ENTER A NUMBER x: ");
        int x = Integer.parseInt(br.readLine());

        double sum = 0.0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; // Calculating factorial

            if (i % 2 == 0) {
                sum -= ((1.0 * x) / fact);
            } else {
                sum += ((1.0 * x) / fact);
            }
        }
        System.out.println("Sum of the series: " + sum);
    }
}
