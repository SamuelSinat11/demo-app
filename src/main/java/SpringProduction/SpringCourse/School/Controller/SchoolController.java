package SpringProduction.SpringCourse.School.Controller;
import SpringProduction.SpringCourse.School.Model.School;
import SpringProduction.SpringCourse.School.Model.SchoolDto;
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
    @PostMapping("/schools")
    public School create(
            @RequestBody School school
    ) {
        return schoolRepository.save(school);
    }

//    @PostMapping("/schools")
//    public SchoolDto create(
//            @RequestBody SchoolDto dto
//    ) {
//        var school = toSchool(Dto);
//        schoolRepository.save(school);
//        return dto;
//
//    private School toSchool(SchoolDto dto) {
//        return new School(dto.name());
//    }

    @GetMapping("/schools")
    public List<School> findAll() {
        return schoolRepository.findAll();
    }
}
