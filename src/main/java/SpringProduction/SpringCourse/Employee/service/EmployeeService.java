package SpringProduction.SpringCourse.Employee.service;

import SpringProduction.SpringCourse.Employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long id);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long id, EmployeeDto updatedEmployeeDto);
    void deleteEmployee(Long id);

}
