import java.util.Scanner;
public class capitalizingFirstLetter {

    static String capitalizeSentence(String sentence){
        String result=" ";
        boolean capitalizeNext=true;

        for(int x=0;x<sentence.length();x++){

            char ch=sentence.charAt(x);

            if(Character.isLetter(ch)){
                if(capitalizeNext){
                    result+=Character.toUpperCase(ch);
                    capitalizeNext=false;
                }else{
                    result+=Character.toLowerCase(ch);
                }
            }else{
                result+=ch;
                capitalizeNext=true;
            }
        }

        return result;
    }










    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
    }
}
