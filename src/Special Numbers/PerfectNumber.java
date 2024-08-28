import java.io.*;

public class PerfectNumber {
    public static void main() throws IOException {
        PerfectNumber obj = new PerfectNumber();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("SUM OF FACTORS = " + obj.calculateSumOfFactors(num));
        if (obj.isPerfect(num) == 1)
            System.out.println("PERFECT NUMBER ");
        else
            System.out.println("NOT A PERFECT NUMBER ");
    }

    public int calculateSumOfFactors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int isPerfect(int num) {
        int sum = calculateSumOfFactors(num);
        return (sum == num) ? 1 : 0;
    }
}
