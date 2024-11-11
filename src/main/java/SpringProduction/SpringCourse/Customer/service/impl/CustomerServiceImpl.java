package SpringProduction.SpringCourse.Customer.service.impl;
import SpringProduction.SpringCourse.Customer.dto.CustomerDto;
import SpringProduction.SpringCourse.Customer.entity.CustomerProduction;
import SpringProduction.SpringCourse.Customer.mapper.CustomerMapper;
import SpringProduction.SpringCourse.Customer.repository.CustomerRepository;
import SpringProduction.SpringCourse.Customer.service.CustomerService;
import SpringProduction.SpringCourse.Employee.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    /**
     * @param customerDto
     * @return
     */

    private CustomerRepository customerRepository;

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        CustomerProduction customerProduction = CustomerMapper.mapCustomerDtoToCustomerProduction(customerDto);
        CustomerProduction savedCustomer = customerRepository.save(customerProduction);
        return CustomerMapper.mapCustomerToCustomerDto(savedCustomer);

    }

    @Override
    public CustomerDto getCustomerById(Long CustomerId) {
        CustomerProduction customerProduction = customerRepository.findById(CustomerId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Customer with id " + CustomerId + " not found!"));
        return CustomerMapper.mapCustomerToCustomerDto(customerProduction);
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<CustomerProduction> customers = customerRepository.findAll();
        return customers.stream().map((customerProduction -> CustomerMapper.mapCustomerToCustomerDto(customerProduction)))
                .collect(Collectors.toList());
    }


}
