import java.text.DecimalFormat;
import java.util.Scanner;
public class ProductionBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat ft = new DecimalFormat("R#,##0.00");
        double bonus = 0.0;
        String bonusMessage = "";

        System.out.println("Employee Bonus Calculator");
// Input employee information
        System.out.print("Enter employee's first name: ");
        String firstName = scanner.nextLine().toUpperCase();

        System.out.print("Enter employee's last name: ");
        String lastName = scanner.nextLine().toUpperCase();

        System.out.print("Enter this year's number of units produced: ");
        int thisYear = scanner.nextInt();
        
        System.out.print("Enter last year's number of units produced: ");
        int lastYear = scanner.nextInt();}}
