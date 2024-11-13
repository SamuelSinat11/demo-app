package SpringProduction.SpringCourse.Customer.mapper;

import SpringProduction.SpringCourse.Customer.dto.CustomerDto;
import SpringProduction.SpringCourse.Customer.entity.CustomerProduction;

public class CustomerMapper {
    public static CustomerDto mapCustomerToCustomerDto(CustomerProduction customerProduction) {
        return new CustomerDto(
                customerProduction.getCustomerId(),
                customerProduction.getCustomerName(),
                customerProduction.getAddress(),
                customerProduction.getNumber(),
                customerProduction.getProduct(),
                customerProduction.getPrice()
        );
    }

    public static CustomerProduction mapCustomerDtoToCustomerProduction(CustomerDto customerDto) {
        return new CustomerProduction(
                customerDto.getCustomerId(),
                customerDto.getCustomerName(),
                customerDto.getAddress(),
                customerDto.getNumber(),
                customerDto.getProduct(),
                customerDto.getPrice()
        );
    }
}
