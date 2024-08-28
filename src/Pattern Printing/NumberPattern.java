/**
1234554321
1234  4321
123    321
12      21
1        1
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberPattern {
    public static void main(String args[]) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("ENTER THE NUMBER OF ROWS=");
            int n = Integer.parseInt(br.readLine());
            int sp = 0;
            
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for (int s = 1; s <= sp; s++) {
                    System.out.print(" ");
                }
                for (int k = i; k >= 1; k--) {
                    System.out.print(k);
                }
                System.out.println();
                sp = sp + 2;
            }
        } catch (Exception e) {
            System.out.println("NUMBER FORMAT EXCEPTION");
        }
    }
}
