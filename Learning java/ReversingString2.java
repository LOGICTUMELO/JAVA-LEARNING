public class ReversingString2 {

    public static String reverseString(String word){
        char ch;
        String reversed="";

        for(int x=0;x<word.length();x++){
          ch=word.charAt(x);

          reversed=ch+reversed;
        }
        return reversed;
    }

    public static  void main(String[] args){
        String name="tumelo";

        System.out.print("The reserved word is "+reverseString(name));
    }
}
