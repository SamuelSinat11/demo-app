package SpringProduction.SpringCourse.Udemy.RestAPI.Controller;

import SpringProduction.SpringCourse.Udemy.RestAPI.Bean.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Project")
public class EmployeeController {


    // SpringBoot using ResponseEntity
    @GetMapping("API/Employee")
    public ResponseEntity <Employee> getEmployee() {
        Employee info1 = new Employee(1,"Samuel", "JAVA DEVELOPER", 1000);
//        return new ResponseEntity<>(info1, HttpStatus.OK);
          return ResponseEntity.ok()
                  .header("custon-header", "Samuel")
                  .body(info1);
    }

    // SpringBoot RestAPI get data
    // http://localhost:8080/employees/3/Sok/Web/4000
    @GetMapping("Employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,"Samuel", "JAVADEVELOPER", 1000));
        employees.add(new Employee(2,"Heng", "Moblie",2000));
        employees.add(new Employee(3,"Sok", "Web", 4000));
        return employees;
    }


    // Variable To searching data
    @GetMapping("employees/{id}/{name}/{experience}/{salary}")
    public Employee employeePathVariable(@PathVariable("id") int id,
                                         @PathVariable("name") String name,
                                         @PathVariable("experience") String experience,
                                         @PathVariable("salary") int salary
                                         ){
        return new Employee(id, name, experience, salary);
    }

    // Spring boot REST API with Request Param
    // http://localhost:8080/Employees/query?id=1&name=Samuel&experience=JAVADEVELOPER

    @GetMapping("Employees/query")
    public Employee studentRequestVariable(@RequestParam int id,
                                           @RequestParam String name,
                                           @RequestParam String experience
                                        ) {
        return new Employee(id, name, experience, 1000);
    }

    // Spring boot Reest API that handles HTTP POST Request - creating new resource
    @PostMapping("Employees/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee) {
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getExperience());
        return employee;
    }

    // Spring boot Rest AIP that handles HTTP PUT Request - updating existing resource
    @PutMapping("Employees/{id}/update")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id) {
        System.out.println(employee.getName());
        System.out.println(employee.getExperience());
        return employee;
    }

    @DeleteMapping("Employee/{id}/delete")
    public String deleteEmployee(@PathVariable("id") int id) {
        System.out.println(id);
        return "Employee deleted successfully";
    }
}


