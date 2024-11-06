package SpringProduction.SpringCourse.Udemy.RestAPI.Controller;

import SpringProduction.SpringCourse.Udemy.RestAPI.Bean.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("API/Employee")
    public Employee getEmployee() {
        Employee info1 = new Employee(1,"Samuel", "JAVA DEVELOPER", 1000);
        return info1;
    };
    // SpringBoot RestAPI get data
    // http://localhost:8080/employees/3/Sok/Web/4000
    @GetMapping("Employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,"Samuel", "JAVA DEVELOPER", 1000));
        employees.add(new Employee(2,"Heng", "Moblie",2000));
        employees.add(new Employee(3,"Sok", "Web", 4000));
        return employees;
    }

    @GetMapping("employees/{id}/{name}/{experience}/{salary}")
    public Employee employeePathVariable(@PathVariable("id") int id,
                                         @PathVariable("name") String name,
                                         @PathVariable("experience") String experience,
                                         @PathVariable("salary") int salary
                                         ){
        return new Employee(id, name, experience, salary);
    }
}


