import java.util.Random;
import java.util.Scanner;

public class CandyDistributionSimulator {
    //main method
    public static void main(String[] args){
        //create and initiate the scanner object
        Scanner in=new Scanner(System.in);
        //declare variables

        int iNumOfStudents,iNumCandies,iCandiesPerStudent,iRemainingCandies;

        //input

        System.out.print("Please enter the number of students present: ");
        iNumOfStudents=in.nextInt();

        //random number generator

        iNumCandies=(int) (160+Math.random()*180);
        //processing
        iCandiesPerStudent=iNumCandies/iNumOfStudents;
        iRemainingCandies=iNumCandies%iNumOfStudents;

        //displaying the outcomes

        System.out.println("Number of students present: "+iNumOfStudents);
        System.out.println("Total number of candies: "+iNumCandies);
        System.out.println("Each student will receive: "+iCandiesPerStudent+" "+"candies");
        System.out.println("There are "+iRemainingCandies+" "+"candie left for distribution");
    }
}
