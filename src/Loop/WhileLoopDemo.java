import java.io.*;

public class WhileLoopDemo {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER=");
        int n = Integer.parseInt(br.readLine());
        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0) {
                System.out.println("The number is prime number");
            } else
                System.out.println("The number is composite number");
        }
    }
}
