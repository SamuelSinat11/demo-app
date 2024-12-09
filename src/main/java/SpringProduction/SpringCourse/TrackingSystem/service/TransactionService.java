package SpringProduction.SpringCourse.TrackingSystem.service;

import SpringProduction.SpringCourse.TrackingSystem.dto.TransactionDto;

public interface TransactionService {
    TransactionDto createTransaction(TransactionDto transactionDto);
    TransactionDto getTransactionById(Integer TransactionId);
}
