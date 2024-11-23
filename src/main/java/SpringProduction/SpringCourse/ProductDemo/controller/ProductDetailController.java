package SpringProduction.SpringCourse.ProductDemo.controller;


import SpringProduction.SpringCourse.ProductDemo.dto.ProductDetailDto;
import SpringProduction.SpringCourse.ProductDemo.service.ProductDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/pos/productDetail")
public class ProductDetailController {

    private final ProductDetailService productDetailService;
    public ProductDetailController(ProductDetailService productDetailService) {
        this.productDetailService = productDetailService;
    }

    // Build Post REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @PostMapping
    public ResponseEntity<ProductDetailDto> creatProductDetail(@RequestBody ProductDetailDto productDetailDto) {
        ProductDetailDto savedProductDetail = (ProductDetailDto) productDetailService.createProductDetail(productDetailDto);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        return new ResponseEntity<>(savedProductDetail, HttpStatus.CREATED);
    }

    // Build Get REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("{ProductDetailId}")
    public ResponseEntity<ProductDetailDto> getProductDetail(@PathVariable("ProductDetailId") Integer productDetailId) {
        ProductDetailDto productDetailDto = productDetailService.getProductDetailById(productDetailId);
        return ResponseEntity.ok(productDetailDto);
    }

    // Build Get All REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping()
    public ResponseEntity<List<ProductDetailDto>> getAllProductDetails() {
        List<ProductDetailDto> productDetailDto = productDetailService.getAllProductDetails();
        return ResponseEntity.ok(productDetailDto);
    }

    // Build Put for the REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @PutMapping("{ProductDetailId}")
    public ResponseEntity<ProductDetailDto> updateProductDetail(@PathVariable("ProductDetailId") Integer ProductDetailId, @RequestBody ProductDetailDto updatedProductDetailDto) {
        ProductDetailDto productDetailDto = productDetailService.updateProductDetail(ProductDetailId, updatedProductDetailDto);
        return ResponseEntity.ok(productDetailDto);
    }

    // Build Delete Product
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @DeleteMapping("{ProductDetailId}")
    public ResponseEntity<String> deleteProductDetail(@PathVariable("ProductDetailId") Integer ProductDetailId) {
        productDetailService.deleteProductDetail(ProductDetailId);
        return ResponseEntity.ok("ProductDetail deleted successfully");
    }
}
