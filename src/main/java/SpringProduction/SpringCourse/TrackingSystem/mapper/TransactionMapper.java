package SpringProduction.SpringCourse.TrackingSystem.mapper;

import SpringProduction.SpringCourse.TrackingSystem.Entity.Transaction;
import SpringProduction.SpringCourse.TrackingSystem.dto.TransactionDto;

public class TransactionMapper {
    public static TransactionDto mapTransactionToTransactionDto(Transaction transaction) {
        return new TransactionDto(
                transaction.getTransactionId(),
                transaction.getType(),
                transaction.getAmount(),
                transaction.getCategory(),
                transaction.getstartDate(),
                transaction.getDescription()
        );
    }
    public static Transaction mapTransactionToTransactionDto(TransactionDto transactionDto) {
        return new Transaction(
                transactionDto.getTransactionId(),
                transactionDto.getType(),
                transactionDto.getAmount(),
                transactionDto.getCategory(),
                transactionDto.getStartDate(),
                transactionDto.getDescription()

        );
    }
}
