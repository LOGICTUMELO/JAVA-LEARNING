import java.util.*;
public class StudCalcPercWithCounter{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int counter=0;

        System.out.print("Do want to calculate your percentage <Y><N>: ");
        char userAnswer=input.next().charAt(0);
        userAnswer=Character.toUpperCase(userAnswer);

        while(userAnswer=='Y'){

            System.out.print("Enter your mark out of 150: ");
            double rMark=input.nextDouble();

            rMark=Math.round((rMark/150)*100);

            System.out.println("Your mark percentage is "+rMark);
            counter++;

            System.out.print("Do want to calculate your percentage <Y><N>: ");
            userAnswer=input.next().charAt(0);
            userAnswer=Character.toUpperCase(userAnswer);
        }
            System.out.println("You are done with calculations");
            System.out.println("Processes: "+counter);
        input.close();
    }
}
