package SpringProduction.SpringCourse.TrackingSystem.Controller;
import SpringProduction.SpringCourse.TrackingSystem.dto.TransactionDto;
import SpringProduction.SpringCourse.TrackingSystem.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/Transaction/api/users")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController ( TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    // Build Post REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @PostMapping
    public ResponseEntity<TransactionDto> createTransaction(@RequestBody TransactionDto transactionDto) {
        TransactionDto SavedTransaction = transactionService.createTransaction(transactionDto);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        return new ResponseEntity<>(SavedTransaction, HttpStatus.CREATED);
    }

    // Build GET REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("{TransactionId}")
    public ResponseEntity<TransactionDto> getTransaction(@PathVariable("TransactionId") Long transactionId) {
        TransactionDto transactionDto = transactionService.getTransactionById(Math.toIntExact(transactionId));
        return ResponseEntity.ok(transactionDto);
    }

    // Build GET ALL REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping()
    public ResponseEntity<List <TransactionDto>> getAllTransaction() {
        List<TransactionDto> transactionDtoList = transactionService.getAllTransactions();
        return ResponseEntity.ok(transactionDtoList);
    }

    // Build Put for the REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @PutMapping("{TransactionId}")
    public ResponseEntity<TransactionDto> updateTransaction(@PathVariable("TransactionId") Long TransactionId, @RequestBody TransactionDto updatedTransaction) {
        TransactionDto transactionDto1 = transactionService.updateTransaction(TransactionId, updatedTransaction);
        return ResponseEntity.ok(transactionDto1);
    }

    // Build Delete for the REST API
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @DeleteMapping("{TransactionId}")
    public ResponseEntity<String> deleteTransaction(@PathVariable("TransactionId") Long TransactionId) {
        transactionService.deleteTransaction(Math.toIntExact(TransactionId));
        return ResponseEntity.ok("Transaction deleted seccessfully");
    }

}
