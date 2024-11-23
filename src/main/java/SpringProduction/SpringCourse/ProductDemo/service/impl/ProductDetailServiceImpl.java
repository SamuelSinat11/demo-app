package SpringProduction.SpringCourse.ProductDemo.service.impl;

import SpringProduction.SpringCourse.Employee.exception.ResourceNotFoundException;
import SpringProduction.SpringCourse.ProductDemo.dto.ProductDetailDto;
import SpringProduction.SpringCourse.ProductDemo.entity.ProductDetail;
import SpringProduction.SpringCourse.ProductDemo.mapper.ProductDetailMapper;
import SpringProduction.SpringCourse.ProductDemo.repository.ProductDetailRepository;
import SpringProduction.SpringCourse.ProductDemo.service.ProductDetailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductDetailServiceImpl implements ProductDetailService {

    private ProductDetailRepository productDetailRepository;

    @Override
    public ProductDetailDto createProductDetail(ProductDetailDto productDetailDto) {
        ProductDetail productDetail = ProductDetailMapper.mapProductDetailTOProductDetail(productDetailDto);
        ProductDetail savedProductDetail = productDetailRepository.save(productDetail);
        return ProductDetailMapper.mapProductDetailToProductDetailDto(savedProductDetail);
    }

    @Override
    public ProductDetailDto getProductDetailById(Integer ProductDetailId) {
        ProductDetail productDetail = productDetailRepository.findById(ProductDetailId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not Found " + Integer.toString(ProductDetailId)));
        return ProductDetailMapper.mapProductDetailToProductDetailDto(productDetail);
    }

    @Override
    public List<ProductDetailDto> getAllProductDetails() {
        List<ProductDetail> productDetail = productDetailRepository.findAll();
            return productDetail.stream().map(ProductDetailMapper::mapProductDetailToProductDetailDto)
                    .collect(Collectors.toList());
    }

    @Override
    public ProductDetailDto updateProductDetail(Integer ProductDetailId, ProductDetailDto productDetailDto) {
        ProductDetail productDetail = productDetailRepository.findById(ProductDetailId).orElseThrow((
                () -> new ResourceNotFoundException("Product is not exiting" + ProductDetailId)
        ));
        productDetail.setNameProduct(productDetailDto.getNameProduct());
        productDetail.setBrandDetail(productDetailDto.getBrandDetail());
        productDetail.setProductCodeDetail(productDetailDto.getProductCodeDetail());
        productDetail.setPriceDetail(productDetailDto.getPriceDetail());
        productDetail.setDescriptionDetail(productDetailDto.getDescriptionDetail());
        productDetail.setSpecsDetail(productDetailDto.getSpecsDetail());
        productDetail.setMainImageDetail(productDetailDto.getMainImageDetail());
        productDetail.setThumbnailDetail(productDetailDto.getThumbnailDetail());
        return ProductDetailMapper.mapProductDetailToProductDetailDto(productDetailRepository.save(productDetail));
    }

    @Override
    public void deleteProductDetail(Integer ProductDetailId) {
        ProductDetail productDetail = productDetailRepository.findById(ProductDetailId).orElseThrow(
                () -> new ResourceNotFoundException("Product is not exiting" + ProductDetailId)
        );
        productDetailRepository.delete(productDetail);
    }
}
