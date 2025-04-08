import java.util.*;
public class AgeLimit{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int discount=25;


        System.out.print("Are you male or female <M><F>: ");
        char gender=input.next().charAt(0);
        gender=Character.toUpperCase(gender);

        System.out.print("Enter your age: ");
        int age=input.nextInt();

        System.out.print("Enter your budget: ");
        int budget=input.nextInt();

        boolean validToEnter=(age>=18)&&(budget>=500);

        while(validToEnter){

            if(gender=='F'){
                System.out.println("Welcome to our club.");
                System.out.println("You get a dicount of "+discount);
                System.out.println("Enjoy yourself lady.");
            }else if (gender=='M'){
                System.out.println("Welcome to our club.");
                System.out.println("Enjoy yourself Gent.");

            }
            System.out.print("Are you male or female <M><F>: ");
            gender=input.next().charAt(0);
            gender=Character.toUpperCase(gender);

            System.out.print("Enter your age: ");
            age=input.nextInt();

            System.out.print("Enter your budget: ");
            budget=input.nextInt();
        }
        System.out.print("We are so sorry but you cannot enter the premices");

        input.close();
    }
}
