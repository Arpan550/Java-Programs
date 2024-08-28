import java.io.*;

public class SortChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE VALUE OF num= ");
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        while (num != -1) {
            int x, y;
            x = num;
            System.out.println("ENTER THE VALUE OF num= ");
            num = Integer.parseInt(br.readLine());
            y = num;
            if ((x != y) && (num != -1))
                count++;
        }
        if (count >= 2)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
