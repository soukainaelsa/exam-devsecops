package com.devsecops.exam.service;

import com.devsecops.exam.dto.EmployeeDto;
import com.devsecops.exam.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> getall();

    EmployeeDto getEmpolyeByid (int id );
    EmployeeDto getEmpolyeByname (String nom);

    EmployeeDto saveEmpolye (EmployeeDto employeeDto);

    EmployeeDto UpdateEmpolye (EmployeeDto employeeDto);

    void deleteEmployee(int id );

}
