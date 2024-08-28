import java.io.*;

public class ArrayPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("ENTER THE INTEGERS");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            for (int k = 1; k <= arr[j]; k++) {
                if (arr[j] % k == 0)
                    count++;
            }
            if (count == 2)
                System.out.println("PRIME NUMBER=" + arr[j]);
            else
                System.out.println("NOT-PRIME NUMBER=" + arr[j]);
            count = 0;
        }
    }
}
