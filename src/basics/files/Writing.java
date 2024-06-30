package basics.files;

import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) {
        String filename = "java-pdf.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is the world of programming..!!");
            System.out.println("File written successfully");
        } catch (IOException ie) {
            System.out.println("An error occurred!!");
            ie.printStackTrace();
        }
    }
}
