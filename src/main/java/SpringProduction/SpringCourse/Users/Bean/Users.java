package SpringProduction.SpringCourse.Users.Bean;

import java.time.LocalDate;

public class Users {
    private String firstname;
    private String lastname;
    private LocalDate dob;
    private String email;
    private int age;

    public Users() {
    }

    public Users(String firstname, String lastname, LocalDate dob, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.email = email;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
