
import java.rmi.RemoteException;

public class BookOrder implements TaskI {
    private String orderType = "book";
    private double TAX_RATE = 0.10;
    private int quantity;
    private int unitPrice;
    private double totalBill;
    
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

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
    public void executeTask() throws RemoteException {
        
    }

    @Override
    public String getResult(int quantity, double price, int orderType) 
            throws RemoteException {
        
        return "";
    }
}
