package SpringProduction.SpringCourse.School.Service;

import SpringProduction.SpringCourse.School.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByFirstNameContaining(String firstName);
}
