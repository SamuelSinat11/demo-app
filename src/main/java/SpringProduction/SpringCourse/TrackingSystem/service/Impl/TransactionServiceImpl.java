package SpringProduction.SpringCourse.TrackingSystem.service.Impl;

import SpringProduction.SpringCourse.Employee.exception.ResourceNotFoundException;
import SpringProduction.SpringCourse.TrackingSystem.Entity.Transaction;
import SpringProduction.SpringCourse.TrackingSystem.dto.TransactionDto;
import SpringProduction.SpringCourse.TrackingSystem.mapper.TransactionMapper;
import SpringProduction.SpringCourse.TrackingSystem.repository.TransctionRepository;
import SpringProduction.SpringCourse.TrackingSystem.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        Transaction transaction = transctionRepository.findById(TransactionId)
                .orElseThrow(() -> new RuntimeException("Transaction not found" + Long.toString(TransactionId)));
        return TransactionMapper.mapTransactionToTransactionDto(transaction);
    }

    @Override
    public List<TransactionDto> getAllTransactions() {
        List<Transaction> transactions = transctionRepository.findAll();
           return transactions.stream().map(TransactionMapper::mapTransactionToTransactionDto)
                   .collect(Collectors.toList());
    }

    @Override
    public TransactionDto updateTransaction(TransactionDto transactionDto) {
        return null;
    }

    @Override
    public TransactionDto updateTransaction(Long TransactionId, TransactionDto transactionDto) {
        return null;
    }

    @Override
    public TransactionDto updateTransaction(Integer TransactionId, TransactionDto transactionDto) {
         Transaction transactionDemo = transctionRepository.findById(TransactionId).orElseThrow(
                 ()-> new ResourceNotFoundException("Transaction is not exiting" + TransactionId)
         );
         transactionDemo.setAmount(transactionDto.getAmount());
         transactionDemo.setDescription(transactionDto.getDescription());
         transactionDemo.setType(transactionDto.getType());
         transactionDemo.setCategory(transactionDto.getCategory());
         transactionDemo.setstartDate(transactionDto.getStartDate());
         return TransactionMapper.mapTransactionToTransactionDto(transctionRepository.save(transactionDemo));
    }

    @Override
    public void deleteTransaction(Integer TransactionId) {
        Transaction transaction = transctionRepository.findById(TransactionId).orElseThrow(
                () -> new ResourceNotFoundException("Transaction not found" + Long.toString(TransactionId))
        );
        transctionRepository.delete(transaction);
    }

}
