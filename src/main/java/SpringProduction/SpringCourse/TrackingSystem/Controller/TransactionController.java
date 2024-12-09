package SpringProduction.SpringCourse.TrackingSystem.Controller;
import SpringProduction.SpringCourse.TrackingSystem.Entity.Transaction;
import SpringProduction.SpringCourse.TrackingSystem.dto.TransactionDto;
import SpringProduction.SpringCourse.TrackingSystem.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@CrossOrigin("*")
@RestController
@RequestMapping("/Transaction/api/users")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController ( TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @PostMapping
    public ResponseEntity<TransactionDto> createTransaction(@RequestBody TransactionDto transactionDto) {
        TransactionDto SavedTransaction = transactionService.createTransaction(transactionDto);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        return new ResponseEntity<>(SavedTransaction, HttpStatus.CREATED);
    }


}
