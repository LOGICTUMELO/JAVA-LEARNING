import java.util.Scanner;


 public class TheTestStats{

    public static int testsDoneInWeek(String[] batchCodes,int[] testsDone,int weekNumber,int monthNumber){
     String  codeToFind="M"+monthNumber +"W"+weekNumber;

     for(int i=0;i<batchCodes.length;i++){
         if(batchCodes[i].equals(codeToFind)){
             return testsDone[i];
         }
       }
     return -1;
    }

    public static double[] percentagePositive(int[] testsDone,int[] positivecases ){
       double[] percentages=new double[testsDone.length];

       for(int i=0;i<testsDone.length;i++){
           if(testsDone[i]!=0){
               percentages[i]=((double)positivecases[i]/testsDone[i]) *100;
           }else{
               percentages[i]=0;
           }
       }
       return percentages;
    }

    public static String highestPercentage(String[] batchCodes,double[] PercentageOfpositives){

        for(int i=0;i<PercentageOfpositives.length-1;i++){
            int maxIndex=i;
                for (int x=i+1;x<PercentageOfpositives.length;x++){
                    if(PercentageOfpositives[i]>PercentageOfpositives[maxIndex]){
                    maxIndex=x;
               }
            }
                double temp=PercentageOfpositives[i];
                PercentageOfpositives[i]=PercentageOfpositives[maxIndex];
                PercentageOfpositives[maxIndex]=temp;

                String tempCode=batchCodes[i];
                batchCodes[i]=batchCodes[maxIndex];
                batchCodes[maxIndex]=tempCode;
        }

        return batchCodes[0];
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        String[] batchCode={
            "M1W1","M1W2","M1W3","M1W4",
            "M2W1","M2W2","M2W3","M2W4",
            "M3W1","M3W2","M3W3","M3W4",
            "M4W1","M4W2","M4W3","M4W4"};

        int[] testsDone={467,587,987,787,
                878,888,936,1002,
                1005,768,887,963,
                789,1008,888,687};

        int[] positiveResults={
                23,87,88,99,
                87,105,222,138,
                333,258,408,444,
                259,236,408,258};

        System.out.print("Enter the month(1-4):");
        int monthNumber= input.nextInt();

        System.out.print("Enter week number:(1-4):");
        int weekNumber=input.nextInt();

        int result=testsDoneInWeek(batchCode,testsDone,weekNumber,monthNumber);

        double[] percentages=percentagePositive(testsDone,positiveResults);

        String highest=highestPercentage(batchCode,percentages);

        System.out.println("The highest percentage batch is: "+highest);

        if(result!=-1){
            System.out.print("Test done in M"+monthNumber+"W"+weekNumber+": "+result);
        }else {
            System.out.println("No matching batch found.");
        }
    }
}


