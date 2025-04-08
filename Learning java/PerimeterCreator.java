import java.util.Scanner;

public class PerimeterCreator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int x,y,z,perimeter;

        System.out.print("Enter the first length: ");
        x=in.nextInt();

        System.out.print("Enter the second length: ");
        y=in.nextInt();

        System.out.print("Enter the third length: ");
        z=in.nextInt();

        perimeter=x+y+z;
        int sum1=x+y;
        int sum2=z+y;
        int sum3=z+x;
        


        boolean isTriangleValid=((sum1>z)&&(sum2>x)&&(sum3>y)&&(perimeter<=100));
        if(isTriangleValid){
            System.out.println("Acceptable dimensions");
        }else{
            System.out.println("dimensions not accepted!!");
        }

    }

}
