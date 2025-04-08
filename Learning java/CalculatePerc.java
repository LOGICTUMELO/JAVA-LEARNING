import java.util.Scanner;
public class CalculatePerc {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        System.out.print("Do you want to enter a mark for the test? <Y><N>: ");
        char userInput=input.next().charAt(0);
        userInput=Character.toUpperCase(userInput);

        while(userInput=='Y'){

            System.out.print("Enter your mark for mathematics out of 150: ");
            double userMark=input.nextInt();


            userMark=((userMark)/150)*100;

            System.out.println("Your mark for mathematics is: "+userMark);
            System.out.println("Congratulations you just used your while loop");
        }
        System.out.println("you are done calculating your percentages");

        input.close();
    }

}
