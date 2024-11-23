package SpringProduction.SpringCourse.ProductDemo.dto;

import SpringProduction.SpringCourse.ProductDemo.entity.ProductDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProductDetailDto extends ProductDetail {
    private Integer productDetailId;
    private String nameProduct;
    private String brandDetail;
    private String productCodeDetail;
    private int priceDetail;
    private String descriptionDetail;
    private String specsDetail;
    private String mainImageDetail;
    private String thumbnailDetail;
    private LocalDate timestampDetail;


}
