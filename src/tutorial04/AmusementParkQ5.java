package tutorial04;

public class AmusementParkQ5 {
    int rideNumber; String rideName;

    public AmusementParkQ5(int rideNumber, String rideName) {
        this.rideNumber = rideNumber; this.rideName = rideName;
    }

    public static void main(String[] args) {
        AmusementParkQ5[] park = {
                new AmusementParkQ5(1, "Roller Coaster"),
                new AmusementParkQ5(2, "Ferris Wheel"),
                new AmusementParkQ5(3, "Bumper Cars"),
                new AmusementParkQ5(4, "Water Ride"),
                new AmusementParkQ5(5, "Haunted House")
        };

        System.out.println("--- AMUSEMENT PARK ACTIVITY LEVEL ---");
        for (AmusementParkQ5 ride : park) {
            System.out.printf("%-15s : ", ride.rideName);

            // Nested loop requirement
            for (int j = 0; j < ride.rideNumber; j++) {
                System.out.print("*");
            }
            System.out.println(); // New line after stars
        }
    }
}