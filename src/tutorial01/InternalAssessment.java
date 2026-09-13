import java.util.Scanner;

public class InternalAssessment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's internal assessment marks: ");
        int marks = sc.nextInt();

        if (marks >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}