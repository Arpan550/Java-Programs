package recursions;

import java.util.Scanner;

public class TowerOfHanoi {
    static int count = 0;

    public static int TOH(int n, char S, char A, char D) {
        if (n == 1) {
            System.out.printf("Move disc %d from tower %c to tower %c\n", n, S, D);
            count++;
        } else {
            TOH(n - 1, S, D, A);
            System.out.printf("Move disc %d from tower %c to tower %c\n", n, S, D);
            count++;
            TOH(n - 1, A, S, D);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of discs: ");
        int n = sc.nextInt();
        System.out.println("\nMovement of Discs:\n");
        TOH(n, 'S', 'A', 'D');
        System.out.println("\nNumber of Minimum Disc Movements: " + count);
    }
}
