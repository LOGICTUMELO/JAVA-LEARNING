import  java.util.Scanner;
public class TempConverter{
    public static void main(String[] args){
      Scanner input =new Scanner(System.in);

      //variables and constants

        final float constant=273.15f;
        final float cons=32f;
        final float con=1.8f;
        int choice;

        System.out.print("What do you want to convert to-(1-Fahrenheit)-(2-Kelvin): ");
        choice=input.nextInt();

        if(choice==1){
            System.out.print("Enter your value in celsius: ");
            float celsius = input.nextFloat();

            float results1 = (celsius * con) + cons;
            System.out.println("Your results are " + results1 + "F.");
        }
        if(choice==2){
            System.out.print("Enter your value in celsius: ");
            float celsius= input.nextFloat();

            float results2=(15*celsius)+constant;
            System.out.println("Your results are "+results2+"K.");
        }
    }
}