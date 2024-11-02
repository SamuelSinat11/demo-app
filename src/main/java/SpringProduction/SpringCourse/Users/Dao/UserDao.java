package SpringProduction.SpringCourse.Users.Dao;

import SpringProduction.SpringCourse.Users.Bean.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Locale.filter;
@Repository
public class UserDao {

    private final List<Users> USERS = new ArrayList<>();


    public Users save(Users s) {
        USERS.add(s);
        return s;
    }


    public List<Users> findAllUsers() {
        return USERS;
    }


    public Users findUserByEmail(String email) {
        return (Users) USERS.stream()
            .filter(s -> email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public Users update(Users s) {
        var UsersIndex = IntStream.range(0, USERS.size())
                .filter(index -> USERS.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
                if (UsersIndex > -1) {
                    USERS.set(UsersIndex, s);
                    return s;
                }
                return null;
    }



    public void deleteUserByEmail(String email) {
        var users = findUserByEmail(email);
        if ( users != null ) {
            USERS.remove(users);
        }

    }
}
