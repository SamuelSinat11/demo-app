package SpringProduction.SpringCourse.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("Users/api/students")
public class UserController {

    // Calling to use the service
    private UserService userService;

    // Add Injection
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // The Json Object List
    @GetMapping("/list")
    public List<Users> findAllUsers() {
        return userService.findAllUsers();
    }
}
