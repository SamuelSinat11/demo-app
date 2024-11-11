package SpringProduction.SpringCourse.Customer.service;

import SpringProduction.SpringCourse.Customer.dto.CustomerDto;

public interface CustomerService {
    CustomerDto createCustomer(CustomerDto customerDto);
    CustomerDto getCustomerById(Long CustomerId);

}
