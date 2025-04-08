import java.util.Scanner;

public class ReadYorNChars {
    public static void main(String[] args){
       Scanner in =new Scanner(System.in);

       System.out.print("Enter your answer <Y>es or <N>o?");
       char answer=in.next().charAt(0);

       if(Character.toUpperCase(answer)=='Y'){
        System.out.print("Your answer is yes");
       }else if(Character.toUpperCase(answer)=='N'){
        System.out.println("Your answer is no");
       }else{
        System.out.print("You entered an illegal character.");
       }
    }
}
