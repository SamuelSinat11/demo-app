package SpringProduction.SpringCourse.Users.Service;

import SpringProduction.SpringCourse.Users.Bean.Users;

import java.util.List;

public interface UserService {

    // Save a new user
    Users save(Users user);

    // Retrieve all users
    List<Users> findAllUsers();

    // Find a user by email
    Users findUserByEmail(String email);

    // Update a user
    Users update(Users user);

    // Delete a user by email
    void delete(String email);
}
