import java.io.*;

public class FrequencyCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE RANGE=");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("ENTER THE NUMBERS=");
        int feq, count = 0;
        int f[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < n; i++) {
            feq = 1; // Reset frequency for each element
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    feq++;
                    arr[j] = 0; // Mark repeated elements as 0 to avoid recounting
                }
            }
            if (arr[i] != 0) {
                f[count++] = feq;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i] + " APPEARS FOR " + f[i] + " TIMES");
            }
        }
    }
}
