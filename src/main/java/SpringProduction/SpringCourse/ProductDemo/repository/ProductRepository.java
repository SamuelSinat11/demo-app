package SpringProduction.SpringCourse.ProductDemo.repository;

import SpringProduction.SpringCourse.ProductDemo.entity.ProductionProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <ProductionProduct, Long > {

}
