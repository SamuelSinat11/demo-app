package SpringProduction.SpringCourse.Auth;

import SpringProduction.SpringCourse.Order.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    @GetMapping("/Register")
    public String Register() {
        return "My First Controller ";
    }

    @GetMapping("/Register/form")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String form () {
        return "You are registered";
    }

    // Method Post use to insert the data into JSON postman
    @PostMapping("/post")
    public String post (
            @RequestBody String message
    ) {
        return "You have the Account" + message;
    }

    @PostMapping("/post-order")
    public String post (
            @RequestBody Order order
    ) {
        return "Request accepted and order is: " + order.toString();
    }

    @PostMapping("/post-order-record")
    public String post (
            @RequestBody OrderRecord orderRecord
    ) {
        return "Request accepted and Record is: " + orderRecord.toString();
    }

    @GetMapping("/Student/{user-name}")
    public String pathVar (
            @PathVariable ("user-name") String userName
    ) {
        return userName;
    }

    @GetMapping("/post-order-productlist")
    public String post (
            @RequestBody ProductList productList
    ) {
        return "Request accepted and ProductList is Recorded : " + productList.toString();

    }
}
