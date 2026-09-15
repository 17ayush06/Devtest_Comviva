/**
 * TotalAmountCalculator - A utility class to calculate total amount
 * This class contains methods to calculate the total amount based on price and quantity
 */
public class TotalAmountCalculator {
    
    /**
     * Calculates the total amount by multiplying price and quantity
     * @param price the unit price (can be decimal)
     * @param quantity the quantity of items
     * @return the total amount (price * quantity)
     */
    public static double calculateTotalAmount(double price, int quantity) {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price and quantity cannot be negative");
        }
        return price * quantity;
    }
    
    /**
     * Overloaded method - calculates total amount with integer price
     * @param price the unit price (integer)
     * @param quantity the quantity of items
     * @return the total amount
     */
    public static int calculateTotalAmount(int price, int quantity) {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price and quantity cannot be negative");
        }
        return price * quantity;
    }
    
    /**
     * Calculates total amount with discount percentage
     * @param price the unit price
     * @param quantity the quantity of items
     * @param discountPercentage the discount percentage (0-100)
     * @return the total amount after applying discount
     */
    public static double calculateTotalAmountWithDiscount(double price, int quantity, double discountPercentage) {
        if (price < 0 || quantity < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Invalid input parameters");
        }
        double totalAmount = price * quantity;
        double discountAmount = (totalAmount * discountPercentage) / 100;
        return totalAmount - discountAmount;
    }
    
    /**
     * Main method to demonstrate the usage
     */
    public static void main(String[] args) {
        System.out.println("=== Total Amount Calculator ===\n");
        
        // Example 1: Basic calculation with double price
        double price1 = 49.99;
        int quantity1 = 5;
        double total1 = calculateTotalAmount(price1, quantity1);
        System.out.println("Example 1 - Decimal Price:");
        System.out.println("Price: $" + price1 + ", Quantity: " + quantity1);
        System.out.println("Total Amount: $" + String.format("%.2f", total1));
        
        // Example 2: Basic calculation with integer price
        int price2 = 100;
        int quantity2 = 3;
        int total2 = calculateTotalAmount(price2, quantity2);
        System.out.println("\nExample 2 - Integer Price:");
        System.out.println("Price: $" + price2 + ", Quantity: " + quantity2);
        System.out.println("Total Amount: $" + total2);
        
        // Example 3: Calculation with discount
        double price3 = 75.50;
        int quantity3 = 4;
        double discountPercentage = 10;
        double total3 = calculateTotalAmountWithDiscount(price3, quantity3, discountPercentage);
        System.out.println("\nExample 3 - With Discount:");
        System.out.println("Price: $" + price3 + ", Quantity: " + quantity3 + ", Discount: " + discountPercentage + "%");
        System.out.println("Total Amount (after discount): $" + String.format("%.2f", total3));
        
        // Example 4: Interactive input
        System.out.println("\n=== Interactive Calculation ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        try {
            System.out.print("Enter price: $");
            double inputPrice = scanner.nextDouble();
            
            System.out.print("Enter quantity: ");
            int inputQuantity = scanner.nextInt();
            
            double result = calculateTotalAmount(inputPrice, inputQuantity);
            System.out.println("Total Amount: $" + String.format("%.2f", result));
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
