import java.util.Scanner;

public class InteractiveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Display the menu
            System.out.println("Interactive Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            // Validate menu input
            int choice = getValidIntInput(scanner, 1, 5);

            switch (choice) {
                case 1:
                    performOperation(scanner, "Addition");
                    break;
                case 2:
                    performOperation(scanner, "Subtraction");
                    break;
                case 3:
                    performOperation(scanner, "Multiplication");
                    break;
                case 4:
                    performOperation(scanner, "Division");
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    // This case will never be reached due to input validation
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void performOperation(Scanner scanner, String operation) {
        System.out.print("Enter the first number: ");
        double num1 = getValidDoubleInput(scanner);

        System.out.print("Enter the second number: ");
        double num2 = getValidDoubleInput(scanner);

        double result;
        switch (operation) {
            case "Addition":
                result = num1 + num2;
                System.out.printf("Result of addition: %.2f\n", result);
                break;
            case "Subtraction":
                result = num1 - num2;
                System.out.printf("Result of subtraction: %.2f\n", result);
                break;
            case "Multiplication":
                result = num1 * num2;
                System.out.printf("Result of multiplication: %.2f\n", result);
                break;
            case "Division":
                // Validate that the divisor is not zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("Result of division: %.2f\n", result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
        }
    }

    private static int getValidIntInput(Scanner scanner, int min, int max) {
        int input;
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.printf("Invalid input. Please enter a number between %d and %d: ", min, max);
                }
            } else {
                System.out.printf("Invalid input. Please enter a number between %d and %d: ", min, max);
                scanner.next(); // Clear the invalid input
            }
        }
    }

    private static double getValidDoubleInput(Scanner scanner) {
        double input;
        while (true) {
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                return input;
            } else {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}

