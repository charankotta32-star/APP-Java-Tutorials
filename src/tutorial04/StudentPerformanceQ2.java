package tutorial04;

public class StudentPerformanceQ2 {
    int roll; String name;
    int[] marks; double attendance;

    public StudentPerformanceQ2(int roll, String name, int[] marks, double attendance) {
        this.roll = roll; this.name = name; this.marks = marks; this.attendance = attendance;
    }

    public static void main(String[] args) {
        StudentPerformanceQ2[] students = {
                new StudentPerformanceQ2(1, "Charan", new int[]{90, 85, 88}, 85.0),
                new StudentPerformanceQ2(2, "Arjun", new int[]{40, 45, 50}, 60.0),
                new StudentPerformanceQ2(3, "Priya", new int[]{80, 75, 78}, 82.0),
                new StudentPerformanceQ2(4, "Rahul", new int[]{60, 65, 62}, 70.0),
                new StudentPerformanceQ2(5, "Neha", new int[]{95, 92, 96}, 90.0)
        };

        double highestAvg = 0.0;
        String topStudent = "";

        System.out.println("--- STUDENT PERFORMANCE SYSTEM ---");
        for (StudentPerformanceQ2 s : students) {
            int total = 0;
            for (int m : s.marks) total += m;
            double avg = total / 3.0;

            // Tracking highest average seamlessly
            if (avg > highestAvg) { highestAvg = avg; topStudent = s.name; }

            // ONE-LINE Ternary Conditions (Strictly following the prompt's constraint!)
            String status = (avg >= 50) ? "Pass" : "Fail";
            String scholarship = (avg >= 75 && s.attendance >= 80) ? "Eligible" : "Not Eligible";
            String grade = (avg >= 85) ? "Excellent" : "Good";

            System.out.printf("Roll: %d | Name: %-7s | Avg: %.1f | %-4s | %-12s | %s\n",
                    s.roll, s.name, avg, status, scholarship, grade);
        }
        System.out.println("\n🏆 Top Student: " + topStudent + " with Average: " + highestAvg);
    }
}