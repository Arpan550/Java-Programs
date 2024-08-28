import java.io.*;

public class Armstrong {
    void armstrongf(int n) {
        int m = n, r, arm = 0, p = n, dig = 0;
        while (p > 0) {
            dig++;
            p = p / 10;
        }

        while (n > 0) {
            r = n % 10;
            arm = arm + (int) (Math.pow(r, dig));
            n = n / 10;
        }
        if (arm == m)
            System.out.println(m + " is ARMSTRONG NUMBER");
    }

    public static void main(String[] args) throws IOException {
        Armstrong ob = new Armstrong();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE RANGE=");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("ENTER THE NUMBERS=");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            ob.armstrongf(arr[i]);
        }
    }
}
