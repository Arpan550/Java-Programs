import java.io.*;

public class TwinPrimeChecker {
    public int isprime(int no) {
        int count = 0, temp = 0;
        for (int i = 1; i <= no; i++) {
            if (no % i == 0)
                count++;
        }
        if (count == 2)
            temp = 1;
        return temp;
    }

    public void display(int m, int n) {
        if (isprime(m) == 1 && isprime(n) == 1 && (int) Math.abs(m - n) == 2)
            System.out.println("TWIN PRIME NUMBERS");
        else
            System.out.println("NOT-TWIN PRIME NUMBERS");
    }

    public static void twinPrime() throws IOException {
        TwinPrimeChecker ob = new TwinPrimeChecker();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER ANY TWO NUMBERS = ");
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        ob.display(m, n);
    }
}
