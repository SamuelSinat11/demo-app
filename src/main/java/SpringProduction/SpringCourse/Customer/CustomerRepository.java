package SpringProduction.SpringCourse.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findCustomerByNameContaining(String name);

    List<Customer> findAllByNameContaining(String name);
}
