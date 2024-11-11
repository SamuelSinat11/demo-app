package SpringProduction.SpringCourse.Customer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDto {
    private Long customerId;
    private String customerName;
    private String address;
    private String number;
    private String product;
    private double price;
}
