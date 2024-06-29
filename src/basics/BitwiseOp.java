package basics;

import java.util.Scanner;

public class BitwiseOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select: 1. bit_and, 2. bit_or, 3. bit_xor, 4. bit_complement, 5. left shift, 6. right shift, 7. exit");
            int op = sc.nextInt();
            if (op == 7) {
                break;
            }

            System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (op) {
                case 1 -> System.out.println("Result: " + bit_and(a, b));
                case 2 -> System.out.println("Result: " + bit_or(a, b));
                case 3 -> System.out.println("Result: " + bit_xor(a, b));
                case 4 -> {
                    int[] complement = bit_complement(a, b);
                    System.out.println("Bit complement of " + a + " is: " + complement[0]);
                    System.out.println("Bit complement of " + b + " is: " + complement[1]);
                }
                case 5 -> System.out.println("Result: " + left_shift(a, b));
                case 6 -> System.out.println("Result: " + right_shift(a, b));
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }

    private static int right_shift(int a, int b) {
        return a >> 2;
    }

    private static int left_shift(int a, int b) {
        return a << 2;
    }

    private static int[] bit_complement(int a, int b) {
        return new int[]{~a, ~b};
    }

    private static int bit_xor(int a, int b) {
        return a ^ b;
    }

    private static int bit_or(int a, int b) {
        return a | b;
    }

    private static int bit_and(int a, int b) {
        return a & b;
    }
}
