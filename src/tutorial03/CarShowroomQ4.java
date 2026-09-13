package tutorial03;

public class CarShowroomQ4 {
    String modelName;
    double price;

    // 1. Constructor: No details
    public CarShowroomQ4() {
        this.modelName = "Unregistered";
        this.price = 0.0;
    }

    // 2. Constructor: Only model name
    public CarShowroomQ4(String modelName) {
        this.modelName = modelName;
        this.price = 0.0;
    }

    // 3. Constructor: Both details
    public CarShowroomQ4(String modelName, double price) {
        this.modelName = modelName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Model: " + modelName + " | Price: Rs." + price);
    }

    public static void main(String[] args) {
        System.out.println("--- Car Registrations ---");
        CarShowroomQ4 car1 = new CarShowroomQ4();
        CarShowroomQ4 car2 = new CarShowroomQ4("Tesla Model 3");
        CarShowroomQ4 car3 = new CarShowroomQ4("Ford Mustang", 5500000);

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
    }
}