import java.io.*;

public class DecimalToOctal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER:");
        int n = Integer.parseInt(br.readLine());
        int oct[] = new int[100];
        int count = 0;

        // Conversion logic
        while (n != 0) {
            oct[count++] = n % 8;
            n = n / 8;
        }

        System.out.print("OCTAL REPRESENTATION: ");
        for (int j = count - 1; j >= 0; j--) {
            System.out.print(oct[j]);
        }
    }
}
