package SpringProduction.SpringCourse.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {


    private final CustomerRepository repository;
    public CustomerController(CustomerRepository customerRepository) {
        this.repository = customerRepository;
    }
    // To Posting database
    @PostMapping("/Customer")
    public Customer post (
            @RequestBody Customer customer
    ) {
        return repository.save(customer);
    }
    // To Find the database display
    @GetMapping("/Customer")
    public List<Customer> findAllCustomer() {
        return repository.findAll();
    }
    // To search the customer id
    @GetMapping("/Customer/{Customer-id}")
    public Customer findById(
            @PathVariable("Customer-id") Integer id
    ) {
        return repository.findById(id)
                .orElse(new Customer());
    }
    // The Method for Searching data
    @GetMapping("/customer/search/{customer-name}")
    public List<Customer> findByCustomerByName(
            @PathVariable("customer-name") String name
    ){
        return repository.findAllByNameContaining(name);

    }

    // To Delete form Database
    @DeleteMapping("/customer/{customer-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(
            @PathVariable ("customer-id") Integer id
    ) {
        repository.deleteById(id);
    }
}
