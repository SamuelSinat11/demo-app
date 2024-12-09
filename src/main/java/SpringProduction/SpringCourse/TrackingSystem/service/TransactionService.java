package SpringProduction.SpringCourse.TrackingSystem.service;

import SpringProduction.SpringCourse.TrackingSystem.dto.TransactionDto;

import java.util.List;

public interface TransactionService {
    TransactionDto createTransaction(TransactionDto transactionDto);
    TransactionDto getTransactionById(Integer TransactionId);
    List<TransactionDto> getAllTransactions();
    TransactionDto updateTransaction(TransactionDto transactionDto);
    TransactionDto updateTransaction(Long TransactionId, TransactionDto transactionDto);

    TransactionDto updateTransaction(Integer TransactionId, TransactionDto transactionDto);

    void deleteTransaction(Integer TransactionId);
}
