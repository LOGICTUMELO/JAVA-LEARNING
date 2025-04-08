import java.util.Scanner;
import java.text.DecimalFormat;
public class CarFinance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat ("R#,###.00");
        //Declaring Variables

        double estimatedRepayment,purchasePrice, depositAmount, period, interestAmount;
        final double initiationFee = 1207.50;
        final double adminFee = 69.00;
        int totalRepayments;
        double principalAmount;


        //processing and display

        System.out.println("+-------Vehicle  Finance Calculator-------");
        System.out.print("| Purchase Price\t\t:R");
        purchasePrice = in.nextDouble();

        System.out.print("| Deposit\t\t\t:R");
        depositAmount = in.nextDouble();

        System.out.print("| Period\t\t:");
        period = in.nextDouble();


        System.out.print("| Interest Rate\t\t:");
        interestAmount=in.nextDouble();
        System.out.println("|--------------------------------");

        //total repayments
        totalRepayments=(int) (period*12);
        //converting annual to monthly
        double monthlyRate=(interestAmount/100/12);
        //A=p*i*(1+i)^n/((1+i)^-1)
        principalAmount=purchasePrice-depositAmount+initiationFee;

        double numerator=principalAmount*monthlyRate*Math.pow(1+monthlyRate,totalRepayments);
        double denominator=Math.pow(1+monthlyRate,totalRepayments)-1;
        estimatedRepayment=(numerator/denominator)+adminFee;
      System.out.println("| Estimated Monthly Repayment:   "+formatter.format(estimatedRepayment));
      System.out.print("+------------------------------------");
    }
}