public class MovieOrder implements TaskI {
    private double TAX_RATE = 0.30;
    private int quantity;
    private int unitPrice;
    private double totalBill;

    public double getTAX_RATE() {
        return TAX_RATE;
    }

    public void setTAX_RATE(double TAX_RATE) {
        this.TAX_RATE = TAX_RATE;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public void executeTask() {
        
    }

    @Override
    public void getResult() {
        
    }
}
