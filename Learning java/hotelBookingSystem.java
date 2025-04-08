import java.util.Scanner;
import java.text.DecimalFormat;

public class hotelBookingSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter=new DecimalFormat("R##,###,00");

        System.out.print("How many rooms are available: ");
        int numOfRoomsAvail=input.nextInt();


        System.out.print("How much is one room per night: ");
        int costOfRoom=input.nextInt();



        System.out.print("*****HOTEL BOOKING SYSTEM*******:");
        System.out.print("1.Book a room:");
        System.out.print("2.Check how many rooms are availabe:");
        System.out.print("3.check if you have booked:");
        System.out.print("4.Exit");

        System.out.print("Enter a number between (1 and 4): ");
        int userInput=input.nextInt();

        Boolean checkValidityOfInput=(userInput>=1)&&(userInput<=4);

        while (checkValidityOfInput){

            if(userInput==4||userInput>4){
                System.out.print("wrong input");
                System.out.print("exiting the hotel booking system");

                break;
            }
             switch (userInput){
                 case 1:
                 System.out.print("how many nights are you planning to stay?");
                 int iDaysOfStay=input.nextInt();

                 System.out.print("Your total will be");
                     break;
                 case 2:




                     break;
                 case 3:




                     break;
             }
        }












        input.close();

    }
}
