package SpringProduction.SpringCourse.ProductDemo.controller;

import SpringProduction.SpringCourse.ProductDemo.dto.ProductDto;
import SpringProduction.SpringCourse.ProductDemo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/production/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Build Post REST API
    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
        ProductDto SavedProduct = productService.createProduct(productDto);
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        return new ResponseEntity<>(SavedProduct, HttpStatus.CREATED);
    }

    // Build Get REST API
    @GetMapping("{productId}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable("productId") Long productId) {
        ProductDto productDto = productService.getProductById(productId);
        return ResponseEntity.ok(productDto);
    }

    // Build GET ALL REST API
    @GetMapping()
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        List<ProductDto> productDtoList = productService.getAllProducts();
        return ResponseEntity.ok(productDtoList);
    }

    // Build Put for the REST API
    @PutMapping("{productId}")
    public ResponseEntity<ProductDto> updateCustomer(@PathVariable("productId") Long productId, @RequestBody ProductDto updateProduct) {
        ProductDto productDto = productService.updateProduct(productId,updateProduct);
        return ResponseEntity.ok(productDto);
    }


    // Build Delete Customer REST API
    @DeleteMapping("{productId}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("productId") Long productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.ok("Customer deleted successfully");
    }
}
