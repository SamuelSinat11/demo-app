package SpringProduction.SpringCourse.Customer.controller;

import SpringProduction.SpringCourse.Customer.dto.CustomerDto;
import SpringProduction.SpringCourse.Customer.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/production/api/customers")
public class CustomerProductionController {

    private final CustomerService customerService;

    public CustomerProductionController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Build Add Customer  Rest API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.createCustomer(customerDto);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    // Build Get Customer REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") Long customerId) {
        CustomerDto customerDto = customerService.getCustomerById(customerId);
        return ResponseEntity.ok(customerDto);
    }

    // Build Get All Customer REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        List <CustomerDto> customerDtoList = customerService.getAllCustomers();
        return ResponseEntity.ok(customerDtoList);
    }

    // Build update Customer REST API
    @PutMapping("{customerId}")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable("customerId") Long customerId, @RequestBody CustomerDto updateCustomer) {
        CustomerDto customerDto = customerService.updateCustomer(customerId,updateCustomer);
        return ResponseEntity.ok(customerDto);
    }

    // Build Delete Customer REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @DeleteMapping("{customerId}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("customerId") Long customerId) {
        customerService.deleteCustomer(customerId);
        return ResponseEntity.ok("Customer deleted successfully");
    }
}
