package SpringProduction.SpringCourse.Users.Controller;

import SpringProduction.SpringCourse.Users.Bean.Users;
import SpringProduction.SpringCourse.Users.Service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Users/api/students")
public class UserController {

    // Calling to use the service
    private final UserService userService;

    // Add Injection

    public UserController(@Qualifier("DB") UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/InsertData")
    public Users save(
         @RequestBody Users users
    ) {
        return userService.save(users);
    }

    @GetMapping("/{email}")
    public Users findUserByEmail(
            @PathVariable("email") String email
    ) {
        return userService.findUserByEmail(email);
    }

    // The Json Object List
    @GetMapping
    public List<Users> findAllUsers() {
        return userService.findAllUsers();
    }

    @PutMapping
    public Users updateUsers(
           @RequestBody Users users
    ) {
        return userService.update(users);
    }

    @DeleteMapping("/{email}")
    public void delete(
            @PathVariable("email") String email
    ) {
        userService.delete(email);
    }
}
