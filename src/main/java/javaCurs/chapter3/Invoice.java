package javaCurs.chapter3;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double partPrice;

    public Invoice(String partNumber, String partDescription, int quantity, double partPrice) {
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setPartPrice(partPrice);
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0) {
            this.quantity = 0;
        } else this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPartPrice(double partPrice) {
        if(partPrice < 0) {
            this.partPrice = 0;
        } else this.partPrice = partPrice;
    }

    public double getPartPrice() {
        return partPrice;
    }

    public double getInvoiceAmount() {
        return getQuantity() * getPartPrice();
    }
}
