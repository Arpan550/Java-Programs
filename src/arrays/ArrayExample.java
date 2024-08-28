import java.io.*;

public class ArrayExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("ENTER THE INTEGERS");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        double avg = 0.0;
        for (int j = 0; j < n; j++) {
            sum = sum + arr[j];
        }
        avg = (double) sum / n;
        System.out.println("TOTAL=" + sum);
        System.out.println("AVERAGE=" + avg);
    }
}
