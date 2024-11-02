package SpringProduction.SpringCourse.Users.Dao;

import SpringProduction.SpringCourse.Users.Bean.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class UserDao {

    private final List<Users> usersList = new ArrayList<>();

    public Users save(Users user) {
        usersList.add(user);
        return user;
    }

    public List<Users> findAllUsers() {
        return new ArrayList<>(usersList);  // Return a copy to avoid external modifications
    }

    public Users findUserByEmail(String email) {
        return usersList.stream()
                .filter(user -> email.equals(user.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public Users update(Users user) {
        int userIndex = IntStream.range(0, usersList.size())
                .filter(index -> usersList.get(index).getEmail().equals(user.getEmail()))
                .findFirst()
                .orElse(-1);

        if (userIndex > -1) {
            usersList.set(userIndex, user);
            return user;
        }
        return null;
    }

    public Users delete(String email) {
        Users user = delete(email);
        if (user != null) {
            usersList.remove(user);
        }
        return user;
    }
}
