import java.io.*;

public class NegativeSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE VALUE OF num= ");
        int num = Integer.parseInt(br.readLine());
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        while (num != -1) {
            if (num < 0) {
                if (num > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = num;
                } else if (num > secondLargest && num != firstLargest) {
                    secondLargest = num;
                }
            }
            System.out.println("ENTER THE VALUE OF num= ");
            num = Integer.parseInt(br.readLine());
        }

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest negative number: " + secondLargest);
        } else {
            System.out.println("No second largest negative number found.");
        }
    }
}
