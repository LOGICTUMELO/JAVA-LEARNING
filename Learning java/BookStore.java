import java.util.Scanner;
public class BookStore {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        final double NOVEL=350.99;
        final double TEXTBOOK=780.99;
        final double TAX_RATE=0.08;
        double rSubtotal,rTotalTax,rTotalDue;
        int iNumberOfNovelBooks,iNumOfTextBooks;

        System.out.print("How many novel books do you want? ");
        iNumberOfNovelBooks= in.nextInt();

        System.out.print("How many textbooks do you want? ");
        iNumOfTextBooks= in.nextInt();

        //processing
        rSubtotal=iNumberOfNovelBooks*NOVEL +iNumOfTextBooks*TEXTBOOK;
        rSubtotal=Math.round((rSubtotal)*100)/100.0;
        rTotalTax=Math.round((rSubtotal*TAX_RATE)*100)/100.0;

        rTotalDue=rTotalTax+rSubtotal;

        System.out.println("Subtotal: "+rSubtotal);
        System.out.println("Tax: "+rTotalTax);
        System.out.println("Total bill including tax: "+rTotalDue);
    }
}
