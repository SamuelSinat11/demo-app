package SpringProduction.SpringCourse.Users.Repository;

import SpringProduction.SpringCourse.Users.Bean.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository <Users, Integer> {

    Users findByEmail(String email);
    void deleteByEmail(String email);
}
