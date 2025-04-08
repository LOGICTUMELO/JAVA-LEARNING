import java.util.Scanner;

public class checkAnigrams {
    public static boolean checkIfAnagram(String fWord,String sWord){


        //check the length of the 2 strings

        if(fWord.length()!=sWord.length()){
            return false;
        }

        //loop through fword

        for(int x=0;x<fWord.length();x++){
            char ch=fWord.charAt(x);

            int count1=0;
            for(int y=0;y<fWord.length();y++){
               if(fWord.charAt(y)==ch){
                   count1++;
               }
            }

            int count2=0;
            for(int z=0;z<sWord.length();z++){
                if(sWord.charAt(z)==ch){
                    count2++;
                }
            }

            if(count1!=count2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String userWord1= input.nextLine().toLowerCase();

        System.out.print("Enter the second word: ");
        String userWord2=input.nextLine().toLowerCase();

        System.out.println(checkIfAnagram(userWord1,userWord2));
    }
}
