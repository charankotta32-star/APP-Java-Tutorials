import java.util.Scanner;

public class MovieTheatreSeats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the seat number: ");
        int seatNumber = sc.nextInt();

        if (seatNumber % 2 == 0) {
            System.out.println("Seat " + seatNumber + " is an EVEN numbered seat. Proceed to the Even Counter.");
        } else {
            System.out.println("Seat " + seatNumber + " is an ODD numbered seat. Proceed to the Odd Counter.");
        }

        sc.close();
    }
}