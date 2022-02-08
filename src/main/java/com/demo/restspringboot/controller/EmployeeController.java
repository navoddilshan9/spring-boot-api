package com.demo.restspringboot.controller;

import com.demo.restspringboot.model.Employee;
import com.demo.restspringboot.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    ///localhost:8080/employee/create
    @PostMapping("/employee/create")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable long id){

        return  new ResponseEntity<>(employeeService.getEmployee(id),HttpStatus.OK);

    }
}
