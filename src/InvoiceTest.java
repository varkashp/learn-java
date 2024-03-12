import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice = new Invoice("Hex bolt", "33", 0, 0.0);
        System.out.printf("Item : %s \nItem# : %s \nQuantity : %d \nPrice per Item : $%.2f%n", invoice.getPartDescription(), invoice.getPartNumber(), invoice.getQuantity(), invoice.getItemPrice());
        System.out.printf("Total Cost : $%.2f%n\n", invoice.getInvoiceAmount());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name of Item :");
        String partDescription = input.nextLine();
        System.out.print("Enter Item Number :");
        String partNumber = input.nextLine();
        System.out.printf("Enter quantity of %ss :", partDescription);
        int quantity = input.nextInt();
        System.out.printf("Enter price per %s :", partDescription);
        double itemPrice = input.nextDouble();

        Invoice invoice1 = new Invoice(partDescription, partNumber, quantity, itemPrice);
        System.out.printf("\nItem : %s \nItem# : %s \nQuantity : %d \nPrice per Item : $%.2f%n", invoice1.getPartDescription(), invoice1.getPartNumber(), invoice1.getQuantity(), invoice1.getItemPrice());
        System.out.printf("Total Cost : $%.2f%n\n", invoice1.getInvoiceAmount());

    }

}
