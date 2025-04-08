import java.util.Scanner;

public class SimpleCal{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("***************SIMPLE CALCULATOR***************");
        System.out.print("Enter your first number: ");
        int x=in.nextInt();

        System.out.print("Enter your second number: ");
        int y=in.nextInt();

        System.out.println("(1-Add) (2-Subract) (3-Multiply) (4-Divide)");
        System.out.print("Enter a number between (1-4): ");
        int Choice=in.nextInt();


        switch(Choice){
            case 1:
            int Sum=x+y;
            System.out.println(Sum);
            break;
            case 2:
            int difference=x-y;
            System.out.println(difference);
            break;
            case 3:
            int product=x*y;
            System.out.println(product);
            break;
            case 4:
            int quotient=x/y;
            System.out.println(quotient);
            break;
            default:
            System.out.println("Sign not found please enter a valid number (1-4)");
        }
    }
} 
