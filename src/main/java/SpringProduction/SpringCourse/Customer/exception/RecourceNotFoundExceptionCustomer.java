package SpringProduction.SpringCourse.Customer.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecourceNotFoundExceptionCustomer extends RuntimeException {
    public RecourceNotFoundExceptionCustomer(String message) {
        super(message);
    }
}
