package SpringProduction.SpringCourse.ProductDemo.mapper;

import SpringProduction.SpringCourse.ProductDemo.dto.ProductDto;
import SpringProduction.SpringCourse.ProductDemo.entity.ProductionProduct;

public class ProductMapper {
    public static ProductDto mapProductTOProductDto (ProductionProduct productionProduct) {
        return new ProductDto(
                productionProduct.getProductId(),
                productionProduct.getProductCode(),
                productionProduct.getProductName(),
                productionProduct.getBrand(),
                productionProduct.getProductDescription(),
                productionProduct.getImageProduct(),
                productionProduct.getQuantity(),
                productionProduct.getPrice(),
                productionProduct.getProductionDate()
        );
    }

    public static ProductionProduct mapProductTOProductionProduct (ProductDto productDto) {
        return new ProductionProduct(
                productDto.getProductId(),
                productDto.getProductCode(),
                productDto.getProductName(),
                productDto.getBrand(),
                productDto.getProductDescription(),
                productDto.getImageProduct(),
                productDto.getPrice(),
                productDto.getQuantity(),
                productDto.getProductionDate()
        );
    }
}
