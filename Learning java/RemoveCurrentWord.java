import java.util.Scanner;
public class RemoveCurrentWord{

    public static String removeLetter(String sentence,char letter){
        String newWord="";

        for(int x=0;x<sentence.length();x++){
           char ch=sentence.charAt(x);
           boolean check=(ch==letter);
           if(!check){
               newWord+=ch;
           }

        }
        return newWord;
    }






    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your sentence: ");
        String userSentence=input.nextLine();

        System.out.print("Enter a character you want to remove: ");
        char userCharacter=input.next().charAt(0);

        System.out.println("Your new word is: "+removeLetter(userSentence,userCharacter));
    }
}
