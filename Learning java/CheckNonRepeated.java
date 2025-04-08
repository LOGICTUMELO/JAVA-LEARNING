import java.util.Scanner;
public class CheckNonRepeated{

    public static char CheckNonRepeating(String word) {
        char nonRepeatingChar = ' ';
        String newWord = "";

        for (int x = 0; x < word.length(); x++) {
            nonRepeatingChar = word.charAt(x);
            int count = 0;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == nonRepeatingChar) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(nonRepeatingChar);
                break;
            }

        }
        return nonRepeatingChar;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String userSentence=input.nextLine();

        System.out.println(CheckNonRepeating(userSentence));
    }
}
