import java.util.Scanner;

public class MagicNumber {
    int sumOfDigits(int no) {
        int r, s = 0;
        while (no > 0) {
            r = no % 10;
            s = s + r;
            no = no / 10;
        }
        return s;
    }

    public void determineMagicNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER [ INTEGER ] =");
        int n = sc.nextInt();
        int r, sum = n, temp = 0;
        while (sum > 0) {
            sum = sumOfDigits(n);
            if (sum == 1) {
                temp = 1;
                break;
            } else if (sum > 1 && sum <= 9) {
                break;
            } else {
                n = sum;
            }
        }
        if (temp == 1) {
            System.out.print("Entered MAGIC NUMBER ");
        } else {
            System.out.print("Entered non-MAGIC NUMBER ");
        }
    }

    public static void main(String[] args) {
        MagicNumber magic = new MagicNumber();
        magic.determineMagicNumber();
    }
}
