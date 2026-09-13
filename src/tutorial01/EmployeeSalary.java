import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Basic Salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter Employee Allowance: ");
        double allowance = sc.nextDouble();

        double totalSalary = basicSalary + allowance;

        System.out.println("\n--- Monthly Salary Slip ---");
        System.out.println("Basic Salary : Rs. " + basicSalary);
        System.out.println("Allowance    : Rs. " + allowance);
        System.out.println("---------------------------");
        System.out.println("Total Salary : Rs. " + totalSalary);

        sc.close();
    }
}