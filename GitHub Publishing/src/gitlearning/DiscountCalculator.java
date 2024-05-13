package gitlearning;

import java.util.Scanner;

public class DiscountCalculator {
    
    public static double calculateTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total = total+price;
        }
        return total;
    }
    
    public static double calculateDiscount(double totalAmount) {
        if (totalAmount > 5000) {
            return totalAmount * 0.20;
        } else {
            return 0;
        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            double[] prices = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter price of item " + (i+1) + ": ");
                prices[i] = scanner.nextDouble();
            }
            
            double totalAmount = calculateTotal(prices);
            
            double discountAmount = calculateDiscount(totalAmount);
            
            // Apply discount if applicable
            if (discountAmount > 0) {
                totalAmount -= discountAmount;
                System.out.println("Congratulations! You have received a 20% discount.");
            } else {
                System.out.println("Sorry, no discount applied.");
            }
            
            System.out.println("Final amount after discount: $" + totalAmount);
            
            scanner.close();
        
    }
}