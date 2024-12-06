package SpringProduction.SpringCourse.TrackingSystem.Controller;

import SpringProduction.SpringCourse.TrackingSystem.Entity.Transaction;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/Transction/api/")
public class TransctionController {
    private Transaction  transaction;

    public TransctionController() {

    }
}
