package SpringProduction.SpringCourse.School.Controller;

import SpringProduction.SpringCourse.School.Model.School;
import SpringProduction.SpringCourse.School.Service.SchoolRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    private final SchoolRepository schoolRepository;

    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }
    @PostMapping("/student")
    public School create(
            @RequestBody School school
    ) {
        return schoolRepository.save(school);
    }

    @GetMapping("/schools")
    public List<School> findAll() {
        return schoolRepository.findAll();
    }
}
