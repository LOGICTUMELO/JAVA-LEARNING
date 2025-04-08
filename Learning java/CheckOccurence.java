import java.util.Scanner;
public class CheckOccurence {

    public static int countOccurence(String sentence,char word) {
        int count = 0;
        // Count occurrences of that letter
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == word) {
                count++;
            }
        }
      return count;
    }


    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your sentence: ");
        String userInput=input.nextLine();

        System.out.println("Enter a character: ");
        char userInput2=input.nextLine().toLowerCase().charAt(0);

        System.out.println("The number of times "+userInput2+"has occured is "+countOccurence(userInput,userInput2));
    }
}
