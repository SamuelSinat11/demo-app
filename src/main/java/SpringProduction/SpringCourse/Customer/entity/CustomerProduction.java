package SpringProduction.SpringCourse.Customer.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name= "customerProduction")
public class CustomerProduction {

    @Id
    @GeneratedValue
    private Long customerId;
    private String customerName;
    private String address;
    private String number;
    private String product;
    private double price;
    private LocalDate productionDate;

    public CustomerProduction(Long customerId, String customerName, String address, String number, String product, double price, LocalDate productionDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.number = number;
        this.product = product;
        this.price = price;
        this.productionDate = LocalDate.now();
    }

    public CustomerProduction() {
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }
}
