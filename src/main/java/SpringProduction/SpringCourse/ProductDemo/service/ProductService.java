package SpringProduction.SpringCourse.ProductDemo.service;

import SpringProduction.SpringCourse.ProductDemo.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);
    ProductDto getProductById(Long ProductId);
    List<ProductDto> getAllProducts();


}
