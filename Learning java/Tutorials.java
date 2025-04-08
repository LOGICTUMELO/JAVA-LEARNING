import java.util.*;
public class Tutorials {


    static final double RATE_PER_HOUR = 355.50;
    static final double TIME_PER_SESSION=1.30;
    static double total = 0.0;


    public static boolean qualify(int mark1, int mark2, int mark3) {
        return (mark1 >= 60) && (mark2 >= 60)||(mark3 >= 50);
    }

    public static double calcTutFee(int numOfSessions) {

        if ((numOfSessions >= 2) && (numOfSessions <= 8)){
            double TotaltimeSession=TIME_PER_SESSION*numOfSessions;
            total = (RATE_PER_HOUR * TotaltimeSession);
        }
        return total;
    }

    public static double displayFee(double totalCost) {

        System.out.println("Your tutorial cost fee R" + totalCost);
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int progr1, compFund, compMath, noSession;
        double payment;

        System.out.print("Enter PPA115D marks:");
        progr1 = input.nextInt();

        System.out.print("Enter COH115D marks:");
        compMath = input.nextInt();

        System.out.print("Enter CFA115D marks:");
        compFund = input.nextInt();


        if (qualify(progr1, compMath, compFund)){

            System.out.print("Enter number of sessions(2-8):");
            noSession = input.nextInt();

            if (noSession >= 2 && noSession <= 8) {
                payment = calcTutFee(noSession);
                displayFee(payment);
            }else{
                System.out.println("Invalid number of sessions");
            }

        }else{
            System.out.println("You do not qualify");
        }
    }
}
