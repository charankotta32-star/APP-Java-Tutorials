package tutorial04;

public class EmployeeManagementQ3 {
    int id; String name; double monthlySalary;

    public EmployeeManagementQ3(int id, String name, double monthlySalary) {
        this.id = id; this.name = name; this.monthlySalary = monthlySalary;
    }

    double getAnnualSalary() { return monthlySalary * 12; }
    boolean isEligibleForBonus() { return monthlySalary >= 30000; }
    double getBonus() { return isEligibleForBonus() ? getAnnualSalary() * 0.10 : 0; }

    void display() {
        System.out.printf("ID: %-3d | Name: %-8s | Annual: ₹%-7.0f | Bonus Eligible: %-5b | Bonus: ₹%.0f\n",
                id, name, getAnnualSalary(), isEligibleForBonus(), getBonus());
    }

    public static void main(String[] args) {
        EmployeeManagementQ3[] team = {
                new EmployeeManagementQ3(101, "Charan", 45000),
                new EmployeeManagementQ3(102, "Amit", 25000),
                new EmployeeManagementQ3(103, "Sara", 35000),
                new EmployeeManagementQ3(104, "John", 28000),
                new EmployeeManagementQ3(105, "Meera", 50000)
        };

        System.out.println("--- EMPLOYEE MANAGEMENT SYSTEM ---");
        for (EmployeeManagementQ3 emp : team) emp.display();
    }
}