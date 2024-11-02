package SpringProduction.SpringCourse.Users.Bean;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "users")
public class Users {

    @Getter
    @Id
    @GeneratedValue
    private Integer id;
    @Getter
    private String firstname;
    @Getter
    private String lastname;
    @Getter
    private LocalDate dob;

    @Getter
    @Column(unique=true)
    private String email;

    @Transient
    private int age;


    public Users( String firstname, String lastname, LocalDate dob, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.email = email;
        this.age = age;
    }
    public Users() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

}
