/**
*
**
***
****
*****
*/
import java.io.IOException;
import java.util.Scanner;

public class StarPattern {
    public static void main(String args[]) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE NUMBER OF ROWS=");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                int j;
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("NUMBER FORMAT EXCEPTION");
        }
    }
}
