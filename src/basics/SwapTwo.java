package basics;

import java.util.Scanner;

class Swap {
    // Method 1: Using a temporary variable
    int[] swappingMethod1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swappingMethod1:");
        System.out.println("a = " + a + ", b = " + b);
        return new int[]{a, b};
    }

    // Method 2: Using arithmetic operations
    int[] swappingMethod2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Inside swappingMethod2:");
        System.out.println("a = " + a + ", b = " + b);
        return new int[]{a, b};
    }

    // Method 3: Using bitwise XOR
    int[] swappingMethod3(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Inside swappingMethod3:");
        System.out.println("a = " + a + ", b = " + b);
        return new int[]{a, b};
    }
}

public class SwapTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Swap swap = new Swap();

        // Method 1: Using swappingMethod1
        System.out.println("Before swapping (Method 1):");
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
        int[] swappedValues = swap.swappingMethod1(n1, n2);
        n1 = swappedValues[0];
        n2 = swappedValues[1];
        System.out.println("After swapping (Method 1):");
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
        System.out.println();

        // Method 2: Using swappingMethod2
        System.out.println("Before swapping (Method 2):");
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
        swappedValues = swap.swappingMethod2(n1, n2);
        n1 = swappedValues[0];
        n2 = swappedValues[1];
        System.out.println("After swapping (Method 2):");
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
        System.out.println();

        // Method 3: Using swappingMethod3
        System.out.println("Before swapping (Method 3):");
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
        swappedValues = swap.swappingMethod3(n1, n2);
        n1 = swappedValues[0];
        n2 = swappedValues[1];
        System.out.println("After swapping (Method 3):");
        System.out.println("n1 = " + n1 + ", n2 = " + n2);

        sc.close();
    }
}