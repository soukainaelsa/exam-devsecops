package com.devsecops.exam.controller;

import com.devsecops.exam.dto.EmployeeDto;
import com.devsecops.exam.repository.EmployeeRepository;
import com.devsecops.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employe")
public class EmployeeControl {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getall")
    public List<EmployeeDto> findtousEmploye(){
        return employeeService.getall();

    }
    @GetMapping("/getemploye/{nom}")
    public EmployeeDto findEmployebyname(@PathVariable String nom){
        return employeeService.getEmpolyeByname(nom);
    }

    @GetMapping("/getemploye/{id}")
    public EmployeeDto findbyid(@PathVariable int id){
        return employeeService.getEmpolyeByid(id);
    }

    @PostMapping("/addemploye")
    public EmployeeDto addEmploye(@RequestBody EmployeeDto employeeDto){
        return employeeService.saveEmpolye(employeeDto);
    }

    @PatchMapping("/modifiyemploye")
    public EmployeeDto updateEmploye(@RequestBody EmployeeDto employeeDto){
        return  employeeService.UpdateEmpolye(employeeDto);
    }

    @DeleteMapping("/deleteemploye")
    public void supprimer (@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
