package SpringProduction.SpringCourse.Users.Service;

import SpringProduction.SpringCourse.Users.Bean.Users;

import java.util.List;


public interface UserService {

    // Post Method
    Users save(Users s);
    // List of data
    List<Users> findAllUsers();
    // Find the email
    Users findUserByEmail(String email);
    // delete
    void deleteUserByEmail(String email);
}
