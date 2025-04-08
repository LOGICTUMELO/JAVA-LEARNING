import java.util.Scanner;
public class DigitChecker{

    public static boolean isNumeric(String digit){

        for(int x=0;x<digit.length();x++){
            char ch=digit.charAt(x);

            if(Character.isLetter(ch)&&!Character.isDigit(ch)){
                return false;
            }

        }

        return true;
    }


    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your digit: ");
        String userInput=input.nextLine();

        System.out.println(isNumeric(userInput));

    }
}
