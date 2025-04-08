import java.util.Scanner;
import java.text.DecimalFormat;

public class BookApp{
    // Constants for prices
    private static final double NEW_BOOK_PRICE = 400.00;
    private static final double USED_BOOK_PRICE = 280.00;
    private static final double RENT_BOOK_PRICE = 150.00;
    private static final double EBOOK_PRICE = 200.00;
    private static final double DISCOUNT_THRESHOLD = 1000.00;
    private static final double DISCOUNT_RATE = 0.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R0.00");

        double cumulativeTotal = 0;
        int totalBooks = 0;

        System.out.println("Welcome to the First-Year Students' Bookstore Purchase Application!");
        //an infinite loop
        while (true) {
            System.out.print("\nEnter student ID number (type -1 to terminate): ");
            int studentId = scanner.nextInt();
            if (studentId == -1) {
                break;
            }

            // Prompt for purchase option
            char purchaseOption;
            double bookPrice = 0;
            String bookType = "";

            while (true) {
                System.out.println("\nPlease select a purchase option:");
                System.out.println("N/n - Buy New Book (R400.00)");
                System.out.println("U/u - Buy Used Book (R280.00)");
                System.out.println("R/r - Rent Book (Per semester) (R150.00)");
                System.out.println("E/e - E-book (R200.00)");

                System.out.print("Option: ");
                purchaseOption = scanner.next().charAt(0);

                if (purchaseOption == 'N' || purchaseOption == 'n') {
                    bookPrice = NEW_BOOK_PRICE;
                    bookType = "New Book(s)";
                    break;
                } else if (purchaseOption == 'U' || purchaseOption == 'u') {
                    bookPrice = USED_BOOK_PRICE;
                    bookType = "Used Book(s)";
                    break;
                } else if (purchaseOption == 'R' || purchaseOption == 'r') {
                    bookPrice = RENT_BOOK_PRICE;
                    bookType = "Book(s) Rented (per semester)";
                    break;
                } else if (purchaseOption == 'E' || purchaseOption == 'e') {
                    bookPrice = EBOOK_PRICE;
                    bookType = "E-book(s)";
                    break;
                } else {
                    System.out.println(purchaseOption + " is invalid. Please enter either N, U, R or E.");
                }
            }

            // Get number of books
            System.out.print("How many books?: ");
            int quantity = scanner.nextInt();
            double totalCost = bookPrice * quantity;

            // Apply discount if applicable
            if (totalCost > DISCOUNT_THRESHOLD) {
                totalCost -= totalCost * DISCOUNT_RATE;
            }

            // Update cumulative totals
            cumulativeTotal += totalCost;
            totalBooks += quantity;

            // Display invoice
            System.out.println("\nInvoice for Student ID: " + studentId);
            System.out.println("Purchase Option: " + quantity + " " + bookType);
            System.out.println("Total Cost: " + df.format(totalCost));
        }

        // Display summary
        if (totalBooks > 0) {
            System.out.println("\nThank you for using the application!");
            System.out.println("Cumulative Total Cost for All Items: " + df.format(cumulativeTotal));
            System.out.println("Total Books Purchased/Rented: " + totalBooks);
            System.out.println("Average Cost Per Book: " + df.format(cumulativeTotal / totalBooks));
        } else {
            System.out.println("\nNo purchases were made.");
        }

        scanner.close();
    }
}

