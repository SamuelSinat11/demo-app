package SpringProduction.SpringCourse.TrackingSystem.Entity;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name="Transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    private String type; // "Income" or "Expense"
    private double amount;
    private String category;

    @CreationTimestamp
    private LocalDate startDate;
    private String description;

    public Transaction(Long transactionId, String type, double amount, String category, LocalDate startDate, String description) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.startDate = startDate;
        this.description = description;
    }

    public Transaction() {

    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getstartDate() {
        return startDate;
    }

    public void setstartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
