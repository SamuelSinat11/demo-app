package SpringProduction.SpringCourse.ProductDemo.service.impl;
import SpringProduction.SpringCourse.Employee.exception.ResourceNotFoundException;
import SpringProduction.SpringCourse.ProductDemo.dto.ProductDto;
import SpringProduction.SpringCourse.ProductDemo.entity.ProductionProduct;
import SpringProduction.SpringCourse.ProductDemo.mapper.ProductMapper;
import SpringProduction.SpringCourse.ProductDemo.repository.ProductRepository;
import SpringProduction.SpringCourse.ProductDemo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        ProductionProduct productionProduct = ProductMapper.mapProductTOProductionProduct(productDto);
        ProductionProduct savedProduct = productRepository.save(productionProduct);
        return ProductMapper.mapProductTOProductDto(savedProduct);
    }

    @Override
    public ProductDto getProductById(Long ProductId) {
        ProductionProduct productionProduct = productRepository.findById(ProductId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found" + Long.toString(ProductId)));
        return ProductMapper.mapProductTOProductDto(productionProduct);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<ProductionProduct> productionProducts = productRepository.findAll();
            return productionProducts.stream().map(ProductMapper::mapProductTOProductDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto updateProduct(Long productId, ProductDto productDto) {
        ProductionProduct product = productRepository.findById(productId).orElseThrow(
                () -> new ResourceNotFoundException("Product is not exiting " + productId)
        );
        product.setProductName(productDto.getProductName());
        product.setBrand(productDto.getBrand());
        product.setImageProduct(productDto.getImageProduct());
        product.setProductCode(productDto.getProductCode());
        product.setQuantity(productDto.getQuantity());
        product.setProductDescription(productDto.getProductDescription());
        product.setPrice(productDto.getPrice());
        return ProductMapper.mapProductTOProductDto(productRepository.save(product));
    }

    @Override
    public void deleteProduct(Long productId) {
        ProductionProduct product = productRepository.findById(productId).orElseThrow(
                () -> new ResourceNotFoundException("Product not found" + Long.toString(productId))
        );
        productRepository.delete(product);
    }

}
