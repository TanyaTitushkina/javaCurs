package javaCurs.chapter3;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("01", "Notebook Asus X541NA-GO008", 3, 3999.99);

        System.out.println("------------------------------------------------");
        System.out.println("|               INVOICE                        |");
        System.out.println("------------------------------------------------");
        System.out.println("| Part Number      | " + invoice1.getPartNumber() + "                        |");
        System.out.println("------------------------------------------------");
        System.out.println("| Part Description | " + invoice1.getPartDescription() + "|");
        System.out.println("------------------------------------------------");
        System.out.println("| Quantity         | " + invoice1.getQuantity() + "                         |");
        System.out.println("------------------------------------------------");
        System.out.println("| Price per part   | " + invoice1.getPartPrice() + " MDL               |");
        System.out.println("------------------------------------------------");
        System.out.println("| Total price      | " + invoice1.getInvoiceAmount() + " MDL              |");
        System.out.println("------------------------------------------------");
    }
}
