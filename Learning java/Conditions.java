import java.util.Scanner;
public class Conditions{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the age here: ");
        int age= in.nextInt();

        if(age<=5){
            System.out.println("You are a child");
        }
        else if (age<=10){
            System.out.println("You are a toddler");
        }else{
            System.out.println("You are older!");
        }
    }
}
