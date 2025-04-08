import java.util.Scanner;

public class BankingMachine {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

                double balance = 5000; // Initial balance
                int choice;

                while (true) {
                    // Display ATM Menu
                    System.out.println("\n===== ATM Menu =====");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Money");
                    System.out.println("3. Withdraw Money");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option: ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            // Check Balance
                            System.out.println("Your current balance is: R" + balance);
                            break;

                        case 2:
                            // Deposit Money
                            System.out.print("Enter deposit amount: R");
                            double deposit = scanner.nextDouble();
                            if (deposit > 0) {
                                balance += deposit;
                                System.out.println("R" + deposit + " deposited successfully.");
                            } else {
                                System.out.println("Invalid deposit amount.");
                            }
                            System.out.println("Updated balance: R" + balance);
                            break;

                        case 3:

                            // Withdraw Money
                            System.out.print("Enter withdrawal amount: R");
                            double withdraw = scanner.nextDouble();
                            if (withdraw > 0 && withdraw <= balance) {
                                balance -= withdraw;
                                System.out.println("R" + withdraw + " withdrawn successfully.");
                            } else if (withdraw > balance) {
                                System.out.println("Insufficient funds! Your balance is: R" + balance);
                            } else {
                                System.out.println("Invalid withdrawal amount.");
                            }
                            System.out.println("Updated balance: R" + balance);
                            break;

                        case 4:
                            // Exit ATM
                            System.out.println("Thank you for using our ATM. Goodbye!");
                            scanner.close();
                            return;

                        default:
                            System.out.println("Invalid choice. Please select a valid option.");
                    }
                }
            }
}


/*
        double bankBalance=5000.00,userDeposit,userWithdrawal;

        System.out.println("1.Check your balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");

        System.out.print("Enter your choice between(1-4): ");
        int userChoice=input.nextInt();

        boolean checkValidOption=(userChoice>=1)&&(userChoice<=3);

        while (checkValidOption){

            switch (userChoice){
                case 1:
                    System.out.println("Your balance is : " +bankBalance);
                    System.out.println("1.Check your balance");
                    System.out.println("2.Deposit");
                    System.out.println("3.Withdraw");
                    System.out.println("4.Exit");
                    System.out.print("Enter your choice between(1-4): ");
                    userChoice=input.nextInt();
                    break;
                case 2:
                    System.out.print("How much do you want to deposit? :");
                    userDeposit=input.nextDouble();
                    bankBalance+=userDeposit;
                    System.out.println("Available balance: "+bankBalance);
                    System.out.println("1.Check your balance");
                    System.out.println("2.Deposit");
                    System.out.println("3.Withdraw");
                    System.out.println("4.Exit");
                    System.out.print("Enter your choice between(1-4): ");
                    userChoice=input.nextInt();
                    break;
                case 3:
                    System.out.print("How much do you want to withdraw?: ");
                    userWithdrawal = input.nextDouble();

                    if(userWithdrawal>bankBalance){
                        System.out.println("The amount you have entered is greater than that of which is available");
                          break;

                    }else {
                        bankBalance -= userWithdrawal;
                        System.out.println("Available balance: " + bankBalance);
                        System.out.println("1.Check your balance");
                        System.out.println("2.Deposit");
                        System.out.println("3.Withdraw");
                        System.out.println("4.Exit");
                        System.out.print("Enter your choice between(1-4): ");
                        userChoice = input.nextInt();
                    }
                    break;
            }

        }
        System.out.print("Exiting the atm machine ");
        System.out.print("Thank you for using the atm\n bye");

        input.close();
    }

 */

