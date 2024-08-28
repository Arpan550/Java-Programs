import java.io.*;

public class NumberClassifier {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        System.out.println("POSITIVE NUMBERS ARE =");
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                System.out.print(arr[i] + ",");
        }
        
        System.out.println("NEGATIVE NUMBERS ARE =");
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                System.out.print(arr[i] + ",");
        }
        
        System.out.println("ZEROS ARE =");
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                System.out.print(arr[i] + ",");
        }
    }
}
