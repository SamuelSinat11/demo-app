package SpringProduction.SpringCourse.School.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Student {

    @Setter
    @Getter
    @Id
    private Integer id;
    @Setter
    @Getter
    private String firstName;

    @Setter
    @Getter
    private String lastName;

    @Getter
    @Setter
    @Column(unique=true)
    private String email;
    @Setter
    private int age;


    @OneToOne (
            mappedBy = "student",
            cascade = CascadeType.ALL
    )
    @Setter
    @Getter
    private StudentProfile studentProfile;


    @ManyToOne
    @JoinColumn(
            name = "school_id"
    )
    @Setter
    @Getter

    @JsonBackReference
    private School school;

    public Student() {
    }

    public Student(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public void setLastName(String s) {

    }


}
