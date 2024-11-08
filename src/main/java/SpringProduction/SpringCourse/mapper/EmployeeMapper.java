package SpringProduction.SpringCourse.mapper;

import SpringProduction.SpringCourse.Employee.dto.EmployeeDto;
import SpringProduction.SpringCourse.Employee.entity.EmployeeProduction;

public class EmployeeMapper {
    public static EmployeeDto mapEmployeeToEmployeeDto(EmployeeProduction employeeProduction) {
        return new EmployeeDto(
                employeeProduction.getId(),
                employeeProduction.getFirstName(),
                employeeProduction.getLastName(),
                employeeProduction.getEmail()
        );
    }

    public static EmployeeProduction mapEmployeeDtoToEmployeeProduction(EmployeeDto employeeDto) {
        return new EmployeeProduction(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
