import java.util.Scanner;
import java.text.DecimalFormat;
public class CircleArea {

    static double  area,radius;

    static final double PI=3.46;

    static double areaOfCircle(){
        area=PI*Math.pow(radius,2);

        return area;
    }






    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        DecimalFormat pattern=new DecimalFormat("##,###.00 meter square");
        System.out.print("Enter the radius: ");
        radius=input.nextDouble();

        double results=areaOfCircle();

        System.out.print("The area of the circle is "+pattern.format(results));

    }
}
