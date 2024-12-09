package SpringProduction.SpringCourse.TrackingSystem.service.Impl;

import SpringProduction.SpringCourse.TrackingSystem.Entity.Transaction;
import SpringProduction.SpringCourse.TrackingSystem.dto.TransactionDto;
import SpringProduction.SpringCourse.TrackingSystem.mapper.TransactionMapper;
import SpringProduction.SpringCourse.TrackingSystem.repository.TransctionRepository;
import SpringProduction.SpringCourse.TrackingSystem.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private TransctionRepository transctionRepository;

    @Override
    public TransactionDto createTransaction(TransactionDto transactionDto) {
        Transaction transactionDemo = TransactionMapper.mapTransactionToTransactionDto(transactionDto);
        Transaction savedTransaction = transctionRepository.save(transactionDemo);
        return TransactionMapper.mapTransactionToTransactionDto(savedTransaction);
    }

    @Override
    public TransactionDto getTransactionById(Integer TransactionId) {
        return null;
    }
}
