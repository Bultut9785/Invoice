import java.text.DecimalFormat;
import java.util.zip.DataFormatException;

public class MyStart {
    public static void dottedLine() {
        int lLenght = 37;
        for (int i = 0; i < lLenght; i++) {
            System.out.print("==");
        }
    }
    public static void tDottedLine() {
        int lLeenght = 10;
        for (int j = 0; j < lLeenght; j++) {
            System.out.print("\t\t\t\t\t\t\t\t\t================");
        }}
    public static void main(String[] args) {
        String myRegNo = "C026-01-0970/2022", myName = "Brian Bultut Chepyegon", myDate = "28/04/2020", cNumber = "0100100100";
        byte noPencil=4,noDuster=10,noPens=9,noCrayon=10,pPencil=20,pDuster=50,pPens=30,pCrayon=80;
        DecimalFormat decimalFormat= new DecimalFormat("0.00");

        float tPencil=noPencil * pPencil,tDuster= noDuster * pDuster,tPens= noPens * pPens,tCrayon= noCrayon * pCrayon;
        String formattedPencil = decimalFormat.format(tPencil),formattedDuster=decimalFormat.format(tDuster),formattedPen=decimalFormat.format(tPens),formattedCrayon=decimalFormat.format(tCrayon);
        float subTotal = tCrayon + tDuster + tPencil + tPens;
        String formattedTotal = decimalFormat.format(subTotal);
        float vatTax = 0.16f;
        String percentTax = (int)(vatTax * 100) + "%";
        float vatAmount =  vatTax * subTotal;
        String vAmount = decimalFormat.format(vatAmount);
        float totalAmount = vatAmount + subTotal;
        String tAmount = decimalFormat.format(totalAmount);




        System.out.println("*************************Adamson Computers Ltd************************");
        System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
        System.out.println("                 VAT REG. TIN 098-765-4321-0000");
        System.out.println("                         SALES INVOICE");
        System.out.println("Sold to:" + myRegNo + "                        Date:" + myDate);
        System.out.println("Address:" + myName + "                   Contact Number:" + cNumber);

        dottedLine();
        System.out.println("\nQty    |    Item Description      |    Unit Price         |Amount");
        dottedLine();
        System.out.println("\n"+noPencil+"      |     pencil               |  "+pPencil+"                   |"+formattedPencil);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(noDuster+"     |     Duster               |  "+pDuster+"                   |"+formattedDuster);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(noPens+"      |     pens                 |  "+pPens+"                   |"+formattedPen);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(noCrayon+"     |     crayon               |  "+pCrayon+"                   |"+formattedCrayon);
        dottedLine();
        System.out.println("\n                                  |Sub Total              |"+formattedTotal);
        System.out.println("  \t\t\t\t\t\t\t\t==========================================");
        System.out.println(""+"                                  |VAT:" +(percentTax)+"                |"+vAmount);
        System.out.println("  \t\t\t\t\t\t\t\t==========================================");
        System.out.println("                                  |Total Amount           |"+tAmount);
        System.out.println("  \t\t\t\t\t\t\t\t==========================================");


    }
}
