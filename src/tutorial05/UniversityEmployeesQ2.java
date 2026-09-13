package tutorial05;

class Employee {
    String name; int id; double basicSalary;
    Employee(String name, int id, double basic) { this.name = name; this.id = id; this.basicSalary = basic; }
    double calculateSalary() { return basicSalary; } // To be overridden
    void display() { System.out.printf("ID: %d | %-10s | Salary: ₹%.2f\n", id, name, calculateSalary()); }
}

class Professor extends Employee {
    Professor(String n, int i, double b) { super(n, i, b); }
    @Override double calculateSalary() { return basicSalary + (basicSalary * 0.50); } // 50% allowance
}

class LabAssistant extends Employee {
    LabAssistant(String n, int i, double b) { super(n, i, b); }
    @Override double calculateSalary() { return basicSalary + (basicSalary * 0.20); } // 20% allowance
}

public class UniversityEmployeesQ2 {
    public static void main(String[] args) {
        System.out.println("--- UNIVERSITY PAYROLL ---");
        Employee p1 = new Professor("Dr. Alan", 101, 80000);
        Employee la1 = new LabAssistant("Ravi", 102, 30000);

        p1.display();
        la1.display();
    }
}