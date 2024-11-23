package SpringProduction.SpringCourse.ProductDemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ProductDetail")
public class ProductDetail {

    @Id
    @GeneratedValue
    private Integer productDetailId;
    private String nameProduct;
    private String brandDetail;
    private String productCodeDetail;
    private int priceDetail;
    private String descriptionDetail;
    private String specsDetail;
    private String mainImageDetail;
    private String thumbnailDetail;

    @CreationTimestamp
    private LocalDate timestampDetail;



    public ProductDetail(Integer productDetailId, String nameProduct, String brandDetail, int priceDetail, String descriptionDetail, String specsDetail, String mainImageDetail, String thumbnailDetail, LocalDate timestampDetail) {
        this.productDetailId = productDetailId;
        this.nameProduct = nameProduct;
        this.brandDetail = brandDetail;
        this.productCodeDetail = productCodeDetail;
        this.priceDetail = priceDetail;
        this.descriptionDetail = descriptionDetail;
        this.specsDetail = specsDetail;
        this.mainImageDetail = mainImageDetail;
        this.thumbnailDetail = thumbnailDetail;
        this.timestampDetail = timestampDetail;
    }

    public Integer getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(Integer productDetailId) {
        this.productDetailId = productDetailId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBrandDetail() {
        return brandDetail;
    }

    public void setBrandDetail(String brandDetail) {
        this.brandDetail = brandDetail;
    }

    public String getProductCodeDetail() {
        return productCodeDetail;
    }

    public void setProductCodeDetail(String productCodeDetail) {
        this.productCodeDetail = productCodeDetail;
    }

    public int getPriceDetail() {
        return priceDetail;
    }

    public void setPriceDetail(int priceDetail) {
        this.priceDetail = priceDetail;
    }

    public String getDescriptionDetail() {
        return descriptionDetail;
    }

    public void setDescriptionDetail(String descriptionDetail) {
        this.descriptionDetail = descriptionDetail;
    }

    public String getSpecsDetail() {
        return specsDetail;
    }

    public void setSpecsDetail(String specsDetail) {
        this.specsDetail = specsDetail;
    }

    public String getMainImageDetail() {
        return mainImageDetail;
    }

    public void setMainImageDetail(String mainImageDetail) {
        this.mainImageDetail = mainImageDetail;
    }

    public String getThumbnailDetail() {
        return thumbnailDetail;
    }

    public void setThumbnailDetail(String thumbnailDetail) {
        this.thumbnailDetail = thumbnailDetail;
    }

    public LocalDate getTimestampDetail() {
        return timestampDetail;
    }

    public void setTimestampDetail(LocalDate timestampDetail) {
        this.timestampDetail = timestampDetail;
    }
}
