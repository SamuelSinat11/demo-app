package SpringProduction.SpringCourse.ProductDemo.repository;

import SpringProduction.SpringCourse.ProductDemo.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer> {

}
