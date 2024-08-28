import java.io.*;

public class BinarySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE RANGE=");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int temp = 0;
        System.out.println("ENTER THE ELEMENTS=");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("ENTER THE ELEMENTS TO BE SEARCH =");
        int no = Integer.parseInt(br.readLine());
        int lb = 0, ub = n - 1, mid;
        while (lb <= ub) {
            mid = (lb + ub) / 2;
            if (arr[mid] == no) {
                temp = 1;
                break;
            }
            if (arr[mid] > no) {
                ub = mid - 1;
            }
            if (arr[mid] < no) {
                lb = mid + 1;
            }
        }
        if (temp == 1)
            System.out.println("ENTERED ELEMENT IS SEARCHED SUCCESSFULLY");
        else
            System.out.println("ENTERED ELEMENT IS NOT FOUND");
    }
}
