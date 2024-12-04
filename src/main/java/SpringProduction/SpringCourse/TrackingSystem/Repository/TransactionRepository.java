package SpringProduction.SpringCourse.TrackingSystem.Repository;

import SpringProduction.SpringCourse.TrackingSystem.Entity.Transaction;
import SpringProduction.SpringCourse.TrackingSystem.dto.TransactionDto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransactionRepository  extends JpaRepository<Transaction, Long> {
   TransactionDto createTransaction(TransactionDto transactionDto);
}
