package SpringProduction.SpringCourse.School.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class School {

    @Setter
    @Getter
    @Id
    @GeneratedValue
    private Integer id;
    @Setter
    @Getter
    private String name;

    @OneToMany(
            mappedBy = "school"
    )
    private List<Student> students;

    public School(List<Student> students) {
        this.students = students;
    }

    public School(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
