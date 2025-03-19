import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Create a Scanner object for user input
        char userChoice;  // Variable to store user choice for continuing or exiting

        do {
            // Display the menu
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = input.nextInt();  // Read the user's choice
            
            switch (choice) {
                case 1: 
                    // Case 1: Classify number
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();  // Read the number
                    
                    // Classify the number as positive, negative, or zero
                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }
                    
                    // Check if the number is even or odd
                    if (number % 2 == 0) {
                        System.out.println("It is an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;
                    
                case 2:
                    // Case 2: Multiplication Table
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();  // Read the number for multiplication table
                    
                    System.out.println("Multiplication Table for " + tableNumber + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;
                    
                case 3:
                    // Case 3: Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                    
                default:
                    // Handle invalid choice
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }
            
            // Ask user if they want to return to the menu
            System.out.print("Do you want to return to the menu? (Y/N): ");
            input.nextLine();  // Consume the leftover newline
            userChoice = input.nextLine().toUpperCase().charAt(0);  // Read user's choice (Y or N)
            
        } while (userChoice == 'Y');  // Continue if user enters 'Y'

        input.close();  // Close the Scanner object when done
    }
}
