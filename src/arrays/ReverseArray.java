import java.io.*;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ELEMENTS =");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("ENTER THE NUMBERS =");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("REVERSED ARRAY =");
        for (int i = n - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}
