package SpringProduction.SpringCourse.Users.Service;

import SpringProduction.SpringCourse.Users.Bean.Users;
import SpringProduction.SpringCourse.Users.Dao.UserDao;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryUserService implements UserService {

    private final UserDao dao;
    public InMemoryUserService(InMemoryUserService dao) {
        this.dao = dao;
    }
    @Override
    public Users save(Users s) {
        return null;
    }

    @Override
    public List<Users> findAllUsers() {
        return null;
    }

    @Override
    public Users findUserByEmail(String email) {
        return null;
    }

    @Override
    public void deleteUserByEmail(String email) {

    }
}
