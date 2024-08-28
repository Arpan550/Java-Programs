import java.io.*;

public class NumberOccurrenceCounter {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE RANGE=");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("ENTER THE NUMBERS=");
        int occ = 0, count = 0;
        int f[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    occ++;
            }
            f[count++] = occ;
            occ = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    arr[i] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                System.out.println(arr[i] + "  APPEARS FOR  " + f[i] + "  TIMES");
        }
    }
}
