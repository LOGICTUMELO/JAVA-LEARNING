import java.util.Scanner;

public class IntAdder {
    public static int adder(int int1,int int2,int int3){
        int sum=int1+int2+int3;
        return sum;
    }






    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int display =adder(2,2,3);

        System.out.print(display);
        input.close();

    }
}
