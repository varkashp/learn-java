public class Invoice {

    private String partDescription;
    private String partNumber;
    private int quantity;
    private double itemPrice;

    public Invoice (String partDescription, String partNumber, int quantity, double itemPrice) {
        this.partDescription = partDescription;
        this. partNumber = partNumber;
        if (quantity > 0) {
            this.quantity = quantity;
        }
        if (itemPrice > 0.0) {
            this.itemPrice = itemPrice;
        }
    }

    public void setPartDescription (String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription () {
        return partDescription;
    }

    public void setPartNumber (String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber () {
        return partNumber;
    }

    public void setQuantity (int quantity) {
        if (quantity < 0) {
            quantity = 0;
        }
        this.quantity = quantity;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setItemPrice (double itemPrice) {
        if (itemPrice < 0.0) {
            itemPrice = 0;
        }
        this.itemPrice = itemPrice;
    }

    public double getItemPrice () {
        return itemPrice;
    }

    public double getInvoiceAmount () {
        return quantity * itemPrice;
    }

}
