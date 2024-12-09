package SpringProduction.SpringCourse.TrackingSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TransactionDto {
    private Long TransactionId;
    private String type;
    private double amount;
    private String category;
    private LocalDate startDate;
    private String description;

}
