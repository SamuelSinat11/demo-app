package SpringProduction.SpringCourse.Users.Service;

import SpringProduction.SpringCourse.Users.Bean.Users;
import SpringProduction.SpringCourse.Users.Dao.UserDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryUserService implements UserService {

    private final UserDao userDao;  // Inject UserDao instead of InMemoryUserService

    public InMemoryUserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Users save(Users user) {
        return userDao.save(user);
    }

    @Override
    public List<Users> findAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    public Users findUserByEmail(String email) {
        return userDao.findUserByEmail(email);
    }

    @Override
    public Users update(Users user) {
        return userDao.update(user);
    }


    @Override
    public void delete(String email) {
        userDao.delete(email);
    }
}
