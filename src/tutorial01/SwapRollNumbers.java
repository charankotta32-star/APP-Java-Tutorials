public class SwapRollNumbers {
    public static void main(String[] args) {
        int roll1 = 45;
        int roll2 = 89;

        System.out.println("Initial Roll Numbers -> Roll 1: " + roll1 + ", Roll 2: " + roll2);

        // (a) Using a temporary variable
        int temp = roll1;
        roll1 = roll2;
        roll2 = temp;
        System.out.println("\nAfter Swapping (Using Temp Variable) -> Roll 1: " + roll1 + ", Roll 2: " + roll2);

        // Resetting back to original for part (b)
        roll1 = 45;
        roll2 = 89;

        // (b) Without using a temporary variable
        roll1 = roll1 + roll2;
        roll2 = roll1 - roll2;
        roll1 = roll1 - roll2;
        System.out.println("After Swapping (Without Temp Variable) -> Roll 1: " + roll1 + ", Roll 2: " + roll2);
    }
}