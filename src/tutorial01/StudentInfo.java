public class StudentInfo {
    public static void main(String[] args) {
        String name = "Kotta Charan Ram Sai";
        String registerNumber = "RA2511051010043";
        String department = "B.Tech CSE (AI & ML)";
        int yearOfStudy = 2;
        String collegeName = "SRM Institute of Science and Technology";

        System.out.println("========================================");
        System.out.println("       STUDENT INFORMATION SYSTEM       ");
        System.out.println("========================================");
        System.out.printf("%-20s: %s\n", "Student Name", name);
        System.out.printf("%-20s: %s\n", "Register Number", registerNumber);
        System.out.printf("%-20s: %s\n", "Department", department);
        System.out.printf("%-20s: Year %d\n", "Year of Study", yearOfStudy);
        System.out.printf("%-20s: %s\n", "College Name", collegeName);
        System.out.println("========================================");
    }
}