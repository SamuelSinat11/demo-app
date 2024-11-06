package SpringProduction.SpringCourse.Udemy.RestAPI.Bean;

public class Employee {
    private int id;
    private String name;
    private String experience;
    private int salary;

    public Employee(int id,String name, String experience, int salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
