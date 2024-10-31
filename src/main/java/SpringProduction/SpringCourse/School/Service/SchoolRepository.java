package SpringProduction.SpringCourse.School.Service;

import SpringProduction.SpringCourse.School.Model.School;
import SpringProduction.SpringCourse.School.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School, Integer> {
    List<School> findAllByNameContaining(String name);

}
