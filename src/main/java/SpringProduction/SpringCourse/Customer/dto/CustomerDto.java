package SpringProduction.SpringCourse.Customer.dto;

import SpringProduction.SpringCourse.Customer.entity.CustomerProduction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDto extends CustomerProduction {
    private Long customerId;
    private String customerName;
    private String address;
    private String number;
    private String product;
    private double price;
}
