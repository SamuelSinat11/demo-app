package SpringProduction.SpringCourse.School.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class StudentProfile {

    @Setter
    @Getter
    @Id
    @GeneratedValue
    private Integer id;
    @Getter
    @Setter
    private String bio;

    @OneToOne
    @JoinColumn(
            name = "student_id"
    )
    private Student student;

    public StudentProfile() {
    }

    public StudentProfile(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "StudentProfile{" +
                "id=" + id +
                ", bio='" + bio + '\'' +
                '}';
    }
}
