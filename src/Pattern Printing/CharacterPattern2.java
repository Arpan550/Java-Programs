import java.io.*;

public class CharacterPattern2 {
    public static void main(String args[]) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("ENTER THE NUMBER OF ROWS =");
            int n = Integer.parseInt(br.readLine());
            int sp = 0;
            
            for (int i = n; i >= 1; i--) {
                for (int j = i; j > n - i + 1; j--) {
                    char ch = (char) (j + 64);
                    System.out.print(ch);
                }
                for (int s = 1; s <= sp; s++) {
                    System.out.print(" ");
                }
                // Increment space count for the next line
                sp++;
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("NUMBER FORMAT EXCEPTION");
        }
    }
}
