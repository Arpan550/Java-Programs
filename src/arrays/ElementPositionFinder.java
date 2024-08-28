import java.io.*;

public class ElementPositionFinder {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int no = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            if (no == arr[i]) {
                temp = 1;
                break;
            }
        }
        if (temp == 1)
            System.out.println("ENTERED ELEMENT IS SEARCHED SUCCESSFULLY");
        else
            System.out.println("ENTERED ELEMENT IS NOT FOUND");
    }
}
