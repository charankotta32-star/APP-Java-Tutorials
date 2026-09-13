package tutorial03;

import java.util.Scanner;

public class SupermarketBillQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] prices = new int[5];
        int totalBill = 0;

        System.out.println("Enter the prices of 5 products:");
        for (int i = 0; i < 5; i++) {
            prices[i] = sc.nextInt();
            totalBill += prices[i];
        }

        System.out.println("\nTotal Bill : " + totalBill);
        if (totalBill > 5000) {
            System.out.println("Discount Applicable");
        } else {
            System.out.println("No Discount");
        }

        sc.close();
    }
}