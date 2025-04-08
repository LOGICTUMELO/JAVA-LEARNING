import  java.util.Scanner;
public class Palindrome {

    public static boolean Checkpalindrome(String word){
        String reversed="";

        char[] reversed_string=word.toCharArray();
        for (int x=reversed_string.length-1;x>=0;x--) {

            reversed += reversed_string[x];

        }

        return word.equalsIgnoreCase(reversed);
    }
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

       System.out.print("Enter your word: ");
       String userInput=input.nextLine();

        System.out.println(Checkpalindrome(userInput));

    }
}
