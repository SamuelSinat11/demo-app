package SpringProduction.SpringCourse.Customer.repository;

import SpringProduction.SpringCourse.Customer.entity.CustomerProduction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <CustomerProduction, Long> {

}
