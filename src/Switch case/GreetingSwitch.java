import java.util.Scanner;

public class GreetingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a number (1-3): ");
        int option = sc.nextInt();
        switch (option) {
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Bonjour");
            default -> System.out.println("Invalid option");
        }
    }
}
