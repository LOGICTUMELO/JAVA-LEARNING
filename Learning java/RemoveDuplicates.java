import java.sql.SQLOutput;
import java.util.Scanner;
public class RemoveDuplicates {

    public static String removeDuplicates(String word){
        String uniqueCharacters="";
        char ch;
        int countDuplicates=0;

        for(int x=0;x<word.length();x++) {
            ch = word.charAt(x);

            //This condition check the first occurance of the first word and ignores the others
            if (uniqueCharacters.indexOf(ch)== -1) {
                uniqueCharacters += ch;
            }else{
                countDuplicates++;
            }
        }
        System.out.println("The number of removed duplicates is:"+countDuplicates);
        return uniqueCharacters;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a word or sententence: ");
        String userInput= input.nextLine();

        System.out.println(removeDuplicates(userInput));
    }
}
