import  java.util.Scanner;
import java.text.DecimalFormat;

public class BookstorePurchaseApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat proper=new DecimalFormat("R0,00");

        //constants and variables

        final double NEW_BOOK=400.00,USED_BOOK=280.00,E_BOOK=200.00,RENT_BOOK=150.00,DISCOUNT=0.1;
        //char cNewBook='N',cUsedBook='U',cEbook='E',cRentBook='R';
        String sNewBookMessage="New Book(s)",sUsedBookMessage="Used Book(s)",sEBookMessage="E-book(s)",sRentBookMessage="Book(s)Rented(per semester)";
        double rAverageCostPerBook=0,rTotalNumberOfBooks=0,rNetCost1=0,rCumulativeCost=0,rNetCost2=0,rNetCost3=0,rNetCost4=0,rGeneralNet=0;
        char cOption;
        int iBookCount1=0,iIdLoopControl=0,iBookCount2=0,iBookCount3=0,iBookCount4=0,iGeneralCount=0;
        String sMessage="";


        System.out.println("Welcome to the first-Year Students' Bookstore Purchace Application!");


            System.out.print("Enter student ID number(type -1 to terminate):");
            iIdLoopControl=input.nextInt();

            do{
                System.out.println("Please select a purchace option:");
                System.out.println("N/n - Buy New Book (R400.00)");
                System.out.println("U/u - Buy Used Book(R280.00)");
                System.out.println("R/r - Rent Book (Per semester) (R150.00)");
                System.out.println("E/e - E-Book (R200.00)");
                System.out.print("Option: ");
                cOption = input.next().charAt(0);
                cOption = Character.toUpperCase(cOption);



                switch (cOption) {
                    case 'N':
                        System.out.print("how many books?");
                        iBookCount1=input.nextInt();
                        iGeneralCount=iBookCount1;
                        rNetCost1= iBookCount1*NEW_BOOK;
                        rGeneralNet=rNetCost1;
                        sMessage=sNewBookMessage;
                        break;
                    case 'U':
                        System.out.print("how many books?");
                        iBookCount2=input.nextInt();
                        iGeneralCount=iBookCount2;
                        rNetCost2= iBookCount2*USED_BOOK;
                        rGeneralNet=rNetCost2;
                        sMessage=sUsedBookMessage;
                        break;
                    case 'R':
                        System.out.print("how many books?");
                        iBookCount3=input.nextInt();
                        iGeneralCount=iBookCount3;
                        rNetCost3 = iBookCount3*RENT_BOOK;
                        rGeneralNet=rNetCost3;
                        sMessage=sRentBookMessage;
                        break;
                    case 'E':
                        System.out.print("how many books?");
                        iBookCount4=input.nextInt();
                        iGeneralCount=iBookCount4;
                        rNetCost4 = iBookCount4*E_BOOK;
                        rGeneralNet=rNetCost4;
                        sMessage=sEBookMessage;
                        break;

                    default:
                    System.out.println(cOption + " is invalid please enter N,U,R or E.");
                        System.out.println("Please select a purchace option:");
                        System.out.println("N/n - Buy New Book (R400.00)");
                        System.out.println("U/u - Buy Used Book(R280.00)");
                        System.out.println("R/r - Rent Book (Per semester) (R150.00)");
                        System.out.println("E/e - E-Book (R200.00)");
                        System.out.print("Option: ");
                        cOption = input.next().charAt(0);
                        cOption = Character.toUpperCase(cOption);
                        break;

                }
                System.out.print("\nInvoice for Student ID: "+iIdLoopControl);
                System.out.print("\nPurchase Option: "+iGeneralCount+"\t"+sMessage);
                System.out.println("\nTotal Cost: "+rGeneralNet);




                System.out.print("Enter student ID number(type -1 to terminate):");
                iIdLoopControl=input.nextInt();

                rCumulativeCost=(rNetCost1+rNetCost2+rNetCost3+rNetCost4);

                if(iIdLoopControl==-1){
                    if(rCumulativeCost>1000){
                       rCumulativeCost-=rCumulativeCost*DISCOUNT;
                    }


                    rTotalNumberOfBooks=iBookCount1+iBookCount2+iBookCount3+iBookCount4;

                    rAverageCostPerBook=rCumulativeCost/rTotalNumberOfBooks;

                    System.out.print("\nThank you for using this application!");
                    System.out.print("\nCumulative Total Cost for All Items: "+rCumulativeCost);
                    System.out.print("\nTotal Books Purchased/Rented: "+rTotalNumberOfBooks);
                    System.out.print("\nAverage Cost Per Book: "+rAverageCostPerBook);
                    break;
                }
            }while(iIdLoopControl!=-1);


    }
}