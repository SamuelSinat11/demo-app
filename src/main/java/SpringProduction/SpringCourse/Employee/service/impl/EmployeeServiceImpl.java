package SpringProduction.SpringCourse.Employee.service.impl;

import SpringProduction.SpringCourse.Employee.dto.EmployeeDto;
import SpringProduction.SpringCourse.Employee.entity.EmployeeProduction;
import SpringProduction.SpringCourse.Employee.repository.EmployeeRepository;
import SpringProduction.SpringCourse.Employee.service.EmployeeService;
import SpringProduction.SpringCourse.Udemy.RestAPI.Bean.Employee;
import SpringProduction.SpringCourse.mapper.EmployeeMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    /**
     * @param employeeDto
     * @return
     */
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        EmployeeProduction employeeProduction = EmployeeMapper.mapEmployeeDtoToEmployeeProduction(employeeDto);
        EmployeeProduction savedEmployee = employeeRepository.save(employeeProduction);
        return EmployeeMapper.mapEmployeeToEmployeeDto(savedEmployee);
    }
}
