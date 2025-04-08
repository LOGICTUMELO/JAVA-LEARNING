//importing the Scanner class
import java.util.Scanner;

//start my class
public class ConcertAge {
    //main method
    public static void main(String[] args){
        //initialize my scanner object

        Scanner in=new Scanner(System.in);

        //declaring variables and constants

        final int ADULT_PRICE=75;
        final int CHILD_PRICE=45;
        int iNumAdults,iNumChild,rAmntRaised;

        //input

        System.out.print("Enter the number of adults: ");
        iNumAdults=in.nextInt();

        System.out.print("Enter the number of kids: ");
        iNumChild=in.nextInt();


        //processing

        rAmntRaised=ADULT_PRICE*iNumAdults+CHILD_PRICE*iNumChild;

        //display

        System.out.print("The amount raised is R"+rAmntRaised);

    }
}
