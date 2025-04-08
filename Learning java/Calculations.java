
import java.util.Scanner;

        public class Calculations {


            public static void main(String[] args) {
                // Create a Scanner object to read input from the user
                Scanner scanner = new Scanner(System.in);
                // Define constants for prices and tax rate using the final keyword
                final double COFFEE_PRICE = 30.50;
                final double PASTRY_PRICE = 22.99;
                final double TAX_RATE = 0.075;
                // Prompt the user to enter the quantity of coffees
                System.out.print("Enter the quantity of coffees: ");
                int coffeeQuantity = scanner.nextInt();

                // Prompt the user to enter the quantity of pastries
                System.out.print("Enter the quantity of pastries: ");
                int pastryQuantity = scanner.nextInt();

                // Calculate the subtotal
                double subtotal =Math.floor((coffeeQuantity * COFFEE_PRICE)) + Math.floor((pastryQuantity * PASTRY_PRICE));
                subtotal = Math.round(subtotal * 100.0) / 100.0;
                // Calculate the tax

                double tax =subtotal * TAX_RATE;
                tax = Math.round(tax * 100.0) / 100.0;
                // Calculate the total bill including tax
                double totalBill =(subtotal + tax);
                totalBill = Math.round(totalBill * 100.0) / 100.0;
                // Display the results, formatted to two decimal places using print
                System.out.println("subtotal: "+ subtotal);
                System.out.println("Tax: "+ tax);
                System.out.println("Total bill including tax: "+ totalBill);

            }
        }