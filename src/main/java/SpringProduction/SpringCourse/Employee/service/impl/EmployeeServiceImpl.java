package SpringProduction.SpringCourse.Employee.service.impl;

import SpringProduction.SpringCourse.Employee.dto.EmployeeDto;
import SpringProduction.SpringCourse.Employee.entity.EmployeeProduction;
import SpringProduction.SpringCourse.Employee.exception.ResourceNotFoundException;
import SpringProduction.SpringCourse.Employee.repository.EmployeeRepository;
import SpringProduction.SpringCourse.Employee.service.EmployeeService;
import SpringProduction.SpringCourse.mapper.EmployeeMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        EmployeeProduction employeeProduction = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee is not exists with given id:" + id));
        return EmployeeMapper.mapEmployeeToEmployeeDto(employeeProduction);
    }

    /**
     * @return
     */
    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeProduction> employees = employeeRepository.findAll();
        return employees.stream().map((employeeProduction) -> EmployeeMapper.mapEmployeeToEmployeeDto(employeeProduction))
                .collect(Collectors.toList());
    }

    /**
     * @param id
     * @param updatedEmployeeDto
     * @return
     */
    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto updatedEmployeeDto) {
        EmployeeProduction employee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee is not exists with given id:" + id)
        );

        employee.setFirstName(updatedEmployeeDto.getFirstName());
        employee.setLastName(updatedEmployeeDto.getLastName());
        employee.setEmail(updatedEmployeeDto.getEmail());
        EmployeeProduction updateEmployeeObj =  employeeRepository.save(employee);
        return EmployeeMapper.mapEmployeeToEmployeeDto(updateEmployeeObj);
    }

    /**
     * @param id
     */
    @Override
    public void deleteEmployee(Long id) {
        EmployeeProduction employee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee is not exists with given id:" + id)
        );
        employeeRepository.deleteById(id);
    }



}
