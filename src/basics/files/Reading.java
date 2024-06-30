package basics.files;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String filename = sc.next();

        try (FileReader reader = new FileReader(filename)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException ie) {
            System.out.println("An error occurred while reading the file.");
            ie.printStackTrace();
        }
    }
}
