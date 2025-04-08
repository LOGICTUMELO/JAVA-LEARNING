import java.util.Scanner;

public class GuessingGame{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        int CompChoice=(int)(Math.random()*16);


        while(true){
            System.out.print("Guess the number from (0-15) to win: ");
            int UserChoice=in.nextInt();

            if(UserChoice==CompChoice){
                System.out.println("You won!!");
                break;
            }else{
                System.out.println("Try again you were close");
                continue;
            }
        }
    }
}
