package SpringProduction.SpringCourse.Users.Repository;

import SpringProduction.SpringCourse.Users.Bean.Users;
import SpringProduction.SpringCourse.Users.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DB")
public class DBUserService implements UserService{

    private final UsersRepository repository;

    public DBUserService(UsersRepository repository) {
        this.repository = repository;
    }

    @Override
    public Users save(Users user) {
        return repository.save(user);
    }

    @Override
    public List<Users> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public Users findUserByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Users update(Users user) {
        return repository.save(user);
    }


    @Override
    public void delete(String email) {
        repository.deleteByEmail(email);
    }

}
