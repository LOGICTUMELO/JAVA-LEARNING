import java.util.Scanner;

public class CountingVowelsandConsonants {


    public static String counter(String word){
        int vowelCounter=0;
        int ConsonantCounter=0;

        char[] convertedWord=word.toCharArray();

        for(int x=0;x<convertedWord.length;x++){

            if(convertedWord[x]=='a'||convertedWord[x]=='e'||convertedWord[x]=='i'||convertedWord[x]=='o'||convertedWord[x]=='u'){
                vowelCounter++;
            }else{
               ConsonantCounter++;
            }

        }
        return "number of vowels is "+vowelCounter +" \n consonants is "+ConsonantCounter;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your word: ");
        String userInput= input.nextLine();

        System.out.println(counter(userInput));
    }

}
