import java.util.Scanner;


public class VarsityReq{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the mark for Maths: ");
        int mark1 = in.nextInt();

        System.out.print("Enter the mark for Physical Science: ");
        int mark2 = in.nextInt();

        System.out.print("Enter the mark for Sepedi: ");
        int mark3 = in.nextInt();

        System.out.print("Enter the mark for English: ");
        int mark4 = in.nextInt();

        System.out.print("Enter the mark for Geography: ");
        int mark5 = in.nextInt();

        System.out.print("Enter the mark for I.T: ");
        int mark6 = in.nextInt();

        boolean mathFlag = mark1 >= 70; 
        boolean physScFlag = mark2 >= 70; 
        int countAbove80 = 0;

        if (mark1 >= 80) countAbove80++;
        if (mark2 >= 80) countAbove80++;
        if (mark3 >= 80) countAbove80++;
        if (mark4 >= 80) countAbove80++;
        if (mark5 >= 80) countAbove80++;
        if (mark6 >= 80) countAbove80++;
        
        boolean fourAbove80Flag = (countAbove80 >= 4);
        

        boolean noBelow60Flag = ((mark1 >= 60) && (mark2 >= 60) && (mark3 >= 60) && (mark4 >= 60) && (mark5 >= 60) && (mark6 >= 60));
        boolean averageFlag = (mark1 + mark2 + mark3 + mark4 + mark5 + mark6) / 6.0 >= 65;

        System.out.println("\nSubjects and Marks:");
        System.out.println("Maths: " + mark1 + "%");
        System.out.println("Physical Science: " + mark2 + "%");
        System.out.println("Subject 3: " + mark3 + "%");
        System.out.println("Subject 4: " + mark4 + "%");
        System.out.println("Subject 5: " + mark5 + "%");
        System.out.println("Subject 6: " + mark6 + "%");


        if (mathFlag && physScFlag && fourAbove80Flag && noBelow60Flag && averageFlag) {
            System.out.println("Result = Qualify for Engineering Studies");
        } else {
            System.out.println("Result = Do not qualify");
        }



    }
}
