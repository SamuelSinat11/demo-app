package SpringProduction.SpringCourse.Users;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    public List<Users> findAllUsers() {
        return List.of(
                new Users(
                        "Samuel",
                        "Sinat",
                        LocalDate.now(),
                        "samuelsinat11@gmail.com",
                        21
                ),
                new Users(
                        "Heng",
                        "Kim",
                        LocalDate.now(),
                        "HengKim11@gmail.com",
                        22
                ),
                new Users(
                        "Leng",
                        "Seven",
                        LocalDate.now(),
                        "lengseven112@gmail.com",
                        23
                )
        );
    }
}
