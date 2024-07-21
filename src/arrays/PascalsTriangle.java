package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        generatePascalTriangle(n);
    }

    private static void generatePascalTriangle(int n) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int num = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(num);
                }
            }
            triangle.add(row);
        }

        // Printing Pascal's Triangle
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
