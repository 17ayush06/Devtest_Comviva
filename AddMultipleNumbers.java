import java.util.Scanner;

public class AddMultipleNumbers {
    
    /**
     * Method to add multiple numbers using variable arguments
     * @param numbers variable number of integers to add
     * @return sum of all numbers
     */
    public static int addNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Main method to demonstrate adding multiple numbers
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Add Multiple Numbers Program ===");
        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();
        
        if (count <= 0) {
            System.out.println("Please enter a positive number.");
            scanner.close();
            return;
        }
        
        int[] numbers = new int[count];
        
        // Input numbers
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Calculate sum
        int sum = addNumbers(numbers);
        
        // Display result
        System.out.println("\n=== Result ===");
        System.out.print("Numbers entered: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        
        scanner.close();
    }
}
