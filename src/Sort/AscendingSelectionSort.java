import java.io.*;

public class AscendingSelectionSort {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF ELEMENTS=");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("ENTER THE NUMBERS=");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("SORTED ELEMENTS = ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
