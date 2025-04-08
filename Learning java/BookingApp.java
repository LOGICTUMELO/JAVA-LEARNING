import java.util.Scanner;

import java.text.DecimalFormat;

//import java.util.Random;

public class BookingApp{

    //static int num;

    //Random randomizer = new Random();

    //int num = randomizer.nextInt(Max - min + 1) + min;

    public static void main(String[] args){

        //instantiate the scanner class

        Scanner kb = new Scanner(System.in);

        String dest = "";

        char flightType;

        int voyagerMiles;

        double pRands = 0;

        double balanceDue = 0;

        System.out.println("Enter the destination: EL,CPT,DBN: ");

        dest = kb.nextLine().toUpperCase();

        //dest = dest.toUpperCase();


        boolean validate = validateDestination(dest);

        while(validate == false){

            System.out.println("Please re-enter the destination: EL,CPT,DBN: ");

            dest = kb.nextLine().toUpperCase();

            validate = validateDestination(dest);

        }

        System.out.println("Enter flight type (S - SINGLE or R-RETURN): ");

        flightType = kb.next().charAt(0);

        flightType = Character.toUpperCase(flightType);

        //invoke the method to determine the price

        double price = determinePrice(dest, flightType);

        System.out.println("Enter the voyager miles: ");

        voyagerMiles = kb.nextInt();

        double pointsEarned = convertPoints(voyagerMiles);

        if(pointsEarned > price){

            //pRands = (price - voyagerMiles);

            pRands = (voyagerMiles - price);

            balanceDue = 0;

        }

        else {

            System.out.println("You cannot use your voyager miles");

            balanceDue = balanceDue + price;

            pRands += voyagerMiles;

        }


        displayBooking(dest, voyagerMiles, price,balanceDue ,pRands);

    }
//Validating destination
    public static boolean validateDestination(String destination){

        boolean valid;

        if(destination.equals("EL") || destination.equals("CPT") || destination.equals("DBN")){

            valid = true;

        }

        else{

            valid = false;

        }

        return valid;

    }
   //method to determine the price of the flight depending on the type of the flight chosen
    //since the output that we want from this method is the final price so we gonna have to return the totalprice.
    //the method takes destination and flighttype as arguements
    public static double determinePrice(String destination, char flightType){


        //declaring and initializing variables inside the method

        double totalPrice = 0.0;

        double price = 0.0;



        //east london flight
        if(destination.equals("EL")){

            price = 1200;

            if(flightType == 'S'){

                totalPrice = totalPrice + price;

            }

            else if(flightType == 'R'){

                totalPrice = totalPrice + (price * 2);

            }

        }
         //cape town flight
        if(destination.equals("CPT")){

            price = 2500;

            if(flightType == 'S'){

                totalPrice = totalPrice + price;

            }

            else if(flightType == 'R'){

                totalPrice = totalPrice + (price * 2);

            }

        }
        //durban flight
        if(destination.equals("DBN")){

            price = 1800;

            if(flightType == 'S'){

                totalPrice = totalPrice + price;

            }

            else if(flightType == 'R'){

                totalPrice = totalPrice + (price * 2);

            }

        }
        //return keyword
        return totalPrice;

    }
     //we need the methods to calculate points
    public static double convertPoints(int voyagerMiles){

        double points = 0;

        double rands = 0;

        rands = (voyagerMiles*0.5);

        points = rands;

        return points;

    }
     //this method displays all the data that we have been calculating into one thing
    public static void displayBooking(String destination, double voyagerMiles, double price,double balanceDue , double pRands){
        //decimal format class
        DecimalFormat df = new DecimalFormat("R0.00");

        System.out.println("Destination" + "\t"+ "Voyager Miles" + "\t" + "Price" + "\t" + "Balance" + "\t\t" + "Balance Points in Rands");

        System.out.println(destination + "\t\t" + df.format(voyagerMiles) + "\t\t" + df.format(price) + "\t\t" + df.format(balanceDue) + "\t\t" + df.format(pRands));

    }


}
