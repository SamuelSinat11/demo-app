package SpringProduction.SpringCourse.ProductDemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecourseNotFoundExceptionProduct extends RuntimeException {

    public RecourseNotFoundExceptionProduct(String message) {
        super(message);
    }

}
