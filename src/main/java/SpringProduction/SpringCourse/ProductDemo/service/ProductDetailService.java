package SpringProduction.SpringCourse.ProductDemo.service;

import SpringProduction.SpringCourse.ProductDemo.dto.ProductDetailDto;
import SpringProduction.SpringCourse.ProductDemo.entity.ProductDetail;

import java.util.List;

public interface ProductDetailService {

    ProductDetail createProductDetail(ProductDetailDto productDetailDto);
    ProductDetailDto getProductDetailById(Integer ProductDetailId);
    List<ProductDetailDto> getAllProductDetails();
    ProductDetailDto updateProductDetail(Integer ProductDetailId, ProductDetailDto productDetailDto);
    void deleteProductDetail(Integer ProductDetailId);
}
