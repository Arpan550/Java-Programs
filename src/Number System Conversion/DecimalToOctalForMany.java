import java.io.*;

public class DecimalToOctalForMany {
    static void dectooct(int n) {
        int oct[] = new int[100];
        int count = 0;
        for (; n != 0;) {
            oct[count++] = n % 8;
            n = n / 8;
        }
        for (int j = count - 1; j >= 0; j--) {
            System.out.print(oct[j]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("ENTER THE NUMBERS:");
        for (int j = 0; j < n; j++) {
            arr[j] = Integer.parseInt(br.readLine());
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " = ");
            dectooct(arr[j]);
            System.out.println();
        }
    }
}
