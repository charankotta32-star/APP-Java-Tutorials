import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score for Student 1: ");
        int score1 = sc.nextInt();
        System.out.print("Enter score for Student 2: ");
        int score2 = sc.nextInt();
        System.out.print("Enter score for Student 3: ");
        int score3 = sc.nextInt();

        int highest = score1;

        if (score2 > highest) {
            highest = score2;
        }
        if (score3 > highest) {
            highest = score3;
        }

        System.out.println("\nThe highest score in the coding competition is: " + highest);
        sc.close();
    }
}