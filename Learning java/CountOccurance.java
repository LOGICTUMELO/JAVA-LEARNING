import java.util.Scanner;
public class CountOccurance{

    public static int countOccurrences(String word, char ch){
       int totalCount=0;

       for(int x=0;x<word.length();x++){
           if(word.charAt(x)==ch){
            totalCount++;
           }

       }

       return totalCount;
    }


    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a word: ");
        String userWord=input.nextLine();

        System.out.print("Enter a characater: ");
        char userCharacter=input.next().charAt(0);

        System.out.println("Output:"+countOccurrences(userWord,userCharacter));
    }
}
