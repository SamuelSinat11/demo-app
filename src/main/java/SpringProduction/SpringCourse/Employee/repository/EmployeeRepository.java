package SpringProduction.SpringCourse.Employee.repository;

import SpringProduction.SpringCourse.Employee.entity.EmployeeProduction;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  EmployeeRepository extends JpaRepository <EmployeeProduction, Long > {


}
