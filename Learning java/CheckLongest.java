import java.util.Scanner;
public class CheckLongest {

    public static String findLongestWord(String sentence){
        String longestWord="";
        String currentWord="";
        int max=0;
        char ch;
        int length=sentence.length();

        for(int x=0;x<=sentence.length();x++){

            if(x<length){
                ch=sentence.charAt(x);
            }else{
                ch=' ';//adds space at the end to process the last word
            }
            //checking if it's a letter or space

            if(Character.isLetterOrDigit(ch)){//if the current word is letter or digit build the word
                currentWord+=ch;

            }else if(!currentWord.isEmpty()){//if the current word is not empty

                if(currentWord.length()>max){

                    longestWord=currentWord;

                    max=currentWord.length();

                }
                currentWord="";
            }
        }
       return longestWord;
    }






    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput=input.nextLine();

        System.out.println(findLongestWord(userInput));
    }
}
