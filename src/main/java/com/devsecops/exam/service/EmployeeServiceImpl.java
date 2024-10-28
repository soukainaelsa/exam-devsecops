package com.devsecops.exam.service;


import com.devsecops.exam.dto.EmployeeDto;
import com.devsecops.exam.mapper.EmployeeMapper;
import com.devsecops.exam.model.Employee;
import com.devsecops.exam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeMapper map;


    @Override
    public List<EmployeeDto> getall(){
        return map.toListDTO(employeeRepository.findAll());
    }

    @Override
    public EmployeeDto getEmpolyeByid (int id ){
        return map.toDto(employeeRepository.findById(id).get());
    }

    @Override
    public EmployeeDto getEmpolyeByname (String nom){
        return map.toDto(employeeRepository.findByname(nom).get());
    }

    @Override
    public EmployeeDto saveEmpolye (EmployeeDto employeeDto){
        employeeRepository.save(map.toEnt(employeeDto));
        return employeeDto;
    }

    @Override
    public EmployeeDto UpdateEmpolye (EmployeeDto employeeDto){
        int Eid = employeeDto.getId();
        Employee employee = employeeRepository.findById(Eid).get();
        employeeRepository.save(map.update(employee,employeeDto));
        return  employeeDto;
    }


    @Override
    public void deleteEmployee(int id ){
        Employee employee = employeeRepository.findById(id).get();
        employeeRepository.delete(employee);

    }
}
