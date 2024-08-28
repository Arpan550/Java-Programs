import java.io.*;

public class ArrayEvenOddSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("ENTER THE INTEGERS");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int odd = 0, even = 0;

        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0) {
                even += arr[j];
            } else {
                odd += arr[j];
            }
        }

        System.out.println("EVEN SUM = " + even);
        System.out.println("ODD SUM = " + odd);
    }
}
