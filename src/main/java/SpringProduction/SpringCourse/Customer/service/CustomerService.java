package SpringProduction.SpringCourse.Customer.service;

import SpringProduction.SpringCourse.Customer.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    CustomerDto createCustomer(CustomerDto customerDto);
    CustomerDto getCustomerById(Long CustomerId);
    List<CustomerDto> getAllCustomers();
    CustomerDto updateCustomer(Long CustomerId, CustomerDto updateCustomerDto);
    void deleteCustomer(Long customerId);
}
