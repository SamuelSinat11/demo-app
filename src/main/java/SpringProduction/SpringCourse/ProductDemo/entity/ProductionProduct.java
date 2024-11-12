package SpringProduction.SpringCourse.ProductDemo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table (name = "productionProduct")
public class ProductionProduct {

    @Id
    @GeneratedValue
    private Long productId;
    private String productCode;
    private String productName;
    private String brand;
    private String productDescription;
    private String imageProduct;
    private int quantity;
    private String price;
    private LocalDate productionDate;

    public ProductionProduct(Long productId, String productCode, String productName, String brand, String productDescription, String imageProduct, String price, int quantity, LocalDate productionDate) {
        this.productId = productId;
        this.productCode = productCode;
        this.productName = productName;
        this.brand = brand;
        this.productDescription = productDescription;
        this.imageProduct = imageProduct;
        this.price = price;
        this.quantity = quantity;
        this.productionDate = productionDate;
    }

    public ProductionProduct() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getImageProduct() {
        return imageProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }
}
