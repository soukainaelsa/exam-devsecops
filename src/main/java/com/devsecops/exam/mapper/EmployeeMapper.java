package com.devsecops.exam.mapper;

import com.devsecops.exam.dto.EmployeeDto;
import com.devsecops.exam.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapper {
    public Employee toEnt (EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getNom(),
                employeeDto.getEmail(),
                employeeDto.getCIN(),
                employeeDto.getPhone()
            );
            return employee;
        }


        public EmployeeDto toDto (Employee employee){
            EmployeeDto employeeDto = new EmployeeDto(
                    employee.getId(),
                    employee.getNom(),
                    employee.getEmail(),
                    employee.getCIN(),
                    employee.getPhone()
            );
            return employeeDto;
        }

        public List<Employee> toListENT (List<EmployeeDto> employeeDtos){
            return employeeDtos.stream().map(dto->toEnt(dto)).collect(Collectors.toList());
        }
        public List<EmployeeDto> toListDTO (List<Employee> employees){
            return employees.stream().map(ent->toDto(ent)).collect(Collectors.toList());
        }

        public Employee update(Employee employee , EmployeeDto employeeDto) {
            employee.setId(employeeDto.getId());
            employee.setNom(employeeDto.getNom());
            employee.setEmail(employeeDto.getEmail());
            employee.setCIN(employeeDto.getCIN());
            employee.setPhone(employeeDto.getPhone());

            return employee ;
        }




}


