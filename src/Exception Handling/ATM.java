import java.io.*;

public class ATM {
    public static void main(String args[]) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("ENTER THE AMOUNT=");
            int amt = Integer.parseInt(br.readLine());
            int th = 0, fh = 0, hu = 0;

            if (amt >= 2000) {
                th = amt / 2000;
                amt = amt % 2000;
            } else if (amt >= 500 && amt < 2000) {
                fh = amt / 500;
                amt = amt % 500;
            } else if (amt >= 100 && amt < 500) {
                hu = amt / 100;
                amt = amt % 100;
            }

            System.out.println("RS.2000=*" + th);
            System.out.println("RS.500=*" + fh);
            System.out.println("RS.100=*" + hu);
        } catch (Exception e) {
            System.out.println("NUMBER FORMAT EXCEPTION");
        }
    }
}
