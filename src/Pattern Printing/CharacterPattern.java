import java.util.Scanner;

public class CharacterPattern {
    public static void main(String args[]) {
        try (Scanner vr = new Scanner(System.in)) {
            System.out.println("ENTER THE NUMBER OF ROWS=");
            int n = vr.nextInt();
            for (int i = 1; i <= n; i++) {
                // There seems to be an issue with the loop control here
                for (int j = i; j >= 1; j--) { // Corrected the loop control
                    char ch = (char) (j + 64);
                    System.out.print(ch);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("NUMBER FORMAT EXCEPTION");
        }
    }
}
