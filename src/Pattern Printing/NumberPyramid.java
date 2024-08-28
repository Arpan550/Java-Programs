import java.io.*;

public class NumberPyramid {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("ENTER THE NUMBER OF ROWS=");
            int n = Integer.parseInt(br.readLine());
            int sp = 0;
            
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
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
