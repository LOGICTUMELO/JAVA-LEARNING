import java.util.*;

public class inBetween {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

        int integer1=0,integer2=0;

        System.out.print("Enter the first integer: ");
        integer1= input.nextInt();

        System.out.print("Enter the second integer: ");
        integer2= input.nextInt();

        int max =Math.max(integer1,integer2),min =Math.min(integer1,integer2);
        boolean bigInt1=(integer1>integer2),bigInt2=(integer2>integer1),rangeTest=(max-min<=1);


        int x,y;
        if(rangeTest){
            System.out.println("Sorry there are no numbers in between.");
        }else if(bigInt1){
            for(x=integer2;x<=integer1;++x){
                System.out.println(x);
            }
        }else if(bigInt2){
            for(y=integer1;y<=integer2;++y){
                System.out.println(y);
            }
        }




        input.close();
    }
}
