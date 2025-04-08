import java.util.Scanner;

public class SoccerBallDistributionSimulator {
    //main method
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        //declare variables

        int iNumTeams,iNumSoccerBalls,iBallsPerTeam,iRemainingBalls;

        //input the number of teams

        System.out.print("Enter the number of teams: ");
        iNumTeams=(int) in.nextDouble();

        iNumSoccerBalls= (int) (45+Math.random()*55);

        //processing

        iBallsPerTeam=iNumSoccerBalls/iNumTeams;
        //The remaining soccer balls after distribution
        iRemainingBalls=iNumSoccerBalls%iNumTeams;


        System.out.println("Number of teams: "+iNumTeams);
        System.out.println("Total number of soccer balls: "+iNumSoccerBalls);
        System.out.println("Each team will receive "+iBallsPerTeam+" "+"soccer balls");
        System.out.println("There are "+" "+iRemainingBalls+" "+"soccer ball left after distribution");
    }
}
