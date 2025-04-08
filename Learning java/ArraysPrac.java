import java.util.Scanner;
public class ArraysPrac{

    public static int searchNum(int[] num,int target){
        for(int x=0;x<num.length;x++){
            if(num[x]==target){
                System.out.println("Number found at index: "+x);
                break;
            }
        }
        return 0;
    }



    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int[] numbers={7,3,345,768,23,98,12,45,8,21,643};

        System.out.print("Enter a number you are searching for: ");
        int userInput=input.nextInt();

        System.out.println(searchNum(numbers,userInput));
    }
}
