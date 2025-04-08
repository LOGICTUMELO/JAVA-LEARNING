import java.util.Scanner;

public class Programme {
    public static void main(String[] args){
     Scanner in=new Scanner(System.in);


     //declaring variables

        final double PAY_PER_KG=9.40;
        final double PACKET_COST=39.99;
        final double SALE_PER_KG=2.5;
        int sac1_Mass,sac2_Mass,totalMass;
        double totalPackets,totalPayPerKg,revenue,profit;

        //processing

       System.out.print("Enter the first weight of the first sack in kilograms: ");
        sac1_Mass=in.nextInt();

        System.out.print("Enter the second weight of the first sack in kilograms: ");
        sac2_Mass=in.nextInt();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        totalMass=sac1_Mass+sac2_Mass;

        totalPackets=(int)(totalMass/SALE_PER_KG);


        System.out.println("Number of packets of mealie meal to be sold: "+totalPackets);

        totalPayPerKg=totalMass*PAY_PER_KG;

        System.out.println("The total cost of mealie meal: "+totalPayPerKg);

        revenue=totalPackets*PACKET_COST;
        System.out.println("Total revenue from selling packets of mealie meal: "+revenue);

        profit=revenue-totalPayPerKg;
        System.out.println("Profit to be made: "+profit);
    }
}
