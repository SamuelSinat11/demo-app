package SpringProduction.SpringCourse.School.Controller;
import SpringProduction.SpringCourse.School.Model.School;
import SpringProduction.SpringCourse.School.Model.Student;
import SpringProduction.SpringCourse.School.Model.StudentDto;
import SpringProduction.SpringCourse.School.Service.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {

    private final StudentRepository repository;
    public StudentController(StudentRepository studentRepository) {
        this.repository = studentRepository;
    }

    // Method Posting to Database
    @PostMapping("/students")
    public Student post(
            @RequestBody StudentDto dto
    ) {
        var student = toStudent(dto);
        return repository.save(student);
    }
    // Dto Configuration 
    private Student toStudent(StudentDto dto) {
        var student = new Student();
        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());

        var school = new School();
        school.setId(dto.SchoolId());

        student.setSchool(school);
        return student;

    }

    // To display List of students
    @GetMapping("/students")
    public List<Student> findAllStudent () {
        return repository.findAll();
    }
    // This for searching the student id
    @GetMapping("/students/{student-id}")
    public Student findStudentById(
            @PathVariable("student-id") Integer id
    ) {
        return repository.findById(id)
                .orElse(new Student());
    }

    // The Method for Searching data
    @GetMapping("/students/search/{student-name} ")
    public List<Student> findStudentByName(
            @PathVariable("student-name") String name
    ) {
        return repository.findAllByFirstNameContaining(name);
    }

    // Delete Method
    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(
            @PathVariable ("student-id") Integer id
    ) {
        repository.deleteById(id);
    }



}
