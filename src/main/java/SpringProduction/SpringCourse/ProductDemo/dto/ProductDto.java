package SpringProduction.SpringCourse.ProductDemo.dto;
import SpringProduction.SpringCourse.ProductDemo.entity.ProductionProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProductDto extends ProductionProduct {
    private Long productId;
    private String productCode;
    private String productName;
    private String brand;
    private String productDescription;
    private String imageProduct;
    private int quantity;
    private String price;
    private LocalDate productionDate;
}



