import java.util.Scanner;

public class ReversingString {

    public static String reverseString(String name){
        String reversed="";

        char[] reversedString_asChar=name.toCharArray();

        for(int i=reversedString_asChar.length-1;i>=0;i--){

             reversed+=reversedString_asChar[i];
        }
        return reversed;
    }




    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);


        System.out.print("Enter a sentence or word: ");
        String userInput=input.nextLine();

        String reversed=reverseString(userInput);

        System.out.println("Your reversed string is "+reversed);

    }
}
