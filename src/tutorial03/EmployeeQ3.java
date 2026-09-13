package tutorial03;

public class EmployeeQ3 {
    int employeeID;
    String employeeName;
    double salary;

    // Constructor to initialize variables
    public EmployeeQ3(int id, String name, double sal) {
        this.employeeID = id;
        this.employeeName = name;
        this.salary = sal;
    }

    public void display() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + (int)salary);
    }

    public static void main(String[] args) {
        // Initializing via Constructor
        EmployeeQ3 emp = new EmployeeQ3(101, "Rahul", 45000);
        emp.display();
    }
}