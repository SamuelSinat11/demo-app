package SpringProduction.SpringCourse.Order;

public class OrderRecord {
    private String customerName;
    private String productName;
    private long quantity;

    @Override
    public String toString() {
        return "OrderRecord{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
