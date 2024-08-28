import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[][] = new String[4][6];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++)
                arr[i][j] = "NB";
        }
        for (;;) {
            String d = sc.nextLine();
            System.out.print("ENTER YOUR NAME=");
            String id = sc.nextLine();

            System.out.print("ENTER FLOOR NUMBER [0 TO 9]=");
            int f = sc.nextInt();
            System.out.print("ENTER ROOM NUMBER [1 TO 20]=");
            int r = sc.nextInt();

            if (arr[f][r - 1].equals("NB")) {
                arr[f][r - 1] = id;
                System.out.println("ACCEPTED");
                System.out.println("The room " + r + " of floor " + f + " is booked for " + id);
            } else {
                System.out.println("TRY AGAIN");
            }

            System.out.println("STATUS OF YOUR HOTEL:-");
            for (int i = 0; i < 4; i++) {
                System.out.print("Floor no=" + (i));
                for (int j = 0; j < 6; j++) {
                    System.out.print(" Room NO:-" + (j + 1) + " " + arr[i][j] + ",");
                }
                System.out.println();
            }

            System.out.println("Your choice: 0 to exit, 1 to continue=");
            int ch = sc.nextInt();
            if (ch == 0)
                break;
            else
                continue;
        }
    }
}
