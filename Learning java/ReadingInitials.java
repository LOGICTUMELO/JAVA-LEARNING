import java.util.Scanner;

public class ReadingInitials{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        char firstName,secondName;
        int Answer;

        System.out.print("Enter your name: ");
        firstName=in.next().charAt(0);

        System.out.print("Do you have a second name?(1-YES)(2-NO):");
        Answer=in.nextInt();

        if(Answer==1) {
            System.out.print("Enter your second name: ");
            secondName = in.next().charAt(0);
            System.out.print("Your initials are: " + firstName + "." + secondName);
        } else if(Answer==2) {
            System.out.print("Your initials are: "+firstName);
        }
    }
}