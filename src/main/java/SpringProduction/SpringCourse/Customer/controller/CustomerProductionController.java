package SpringProduction.SpringCourse.Customer.controller;

import SpringProduction.SpringCourse.Customer.dto.CustomerDto;
import SpringProduction.SpringCourse.Customer.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/production/api/customers")
public class CustomerProductionController {

    private CustomerService customerService;

    public CustomerProductionController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Build Add Customer  Rest API
    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.createCustomer(customerDto);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    // Build Get Customer REST API
    @GetMapping("{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") Long customerId) {
        CustomerDto customerDto = customerService.getCustomerById(customerId);
        return ResponseEntity.ok(customerDto);
    }


}
