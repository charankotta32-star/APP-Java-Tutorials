package tutorial03;

import java.util.Scanner;

public class AttendanceRecordQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] attendance = new int[7];
        int presentDays = 0;

        System.out.println("Enter attendance for 7 days (1 for Present, 0 for Absent):");
        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();
            if (attendance[i] == 1) {
                presentDays++;
            }
        }

        double percentage = ((double) presentDays / 7) * 100;

        if (percentage >= 75.0) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}