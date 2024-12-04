package SpringProduction.SpringCourse.TrackingSystem.mapper;

import SpringProduction.SpringCourse.TrackingSystem.Entity.Transaction;
import SpringProduction.SpringCourse.TrackingSystem.dto.TransactionDto;

public class TransactionMapper {
    public static TransactionDto mapTranscationDto(TransactionDto transcationDto) {
        return new TransactionDto(
                transcationDto.getTranscationId(),
                transcationDto.getType(),
                transcationDto.getAmount(),
                transcationDto.getCategory(),
                transcationDto.getStartDate(),
                transcationDto.getDescription()
        );
    }
    public static Transaction mapTransaction(Transaction transaction) {
        return new Transaction(
                transaction.getTransactionId(),
                transaction.getType(),
                transaction.getAmount(),
                transaction.getCategory(),
                transaction.getstartDate(),
                transaction.getDescription()

        );
    }
}
