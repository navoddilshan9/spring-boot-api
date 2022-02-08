package com.demo.restspringboot.services.impl;

import com.demo.restspringboot.model.Employee;
import com.demo.restspringboot.repository.EmployeeRepository;
import com.demo.restspringboot.services.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceEmpl implements EmployeeService {
    private EmployeeRepository employeeRepository;


    public EmployeeServiceEmpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee getEmployee(long id) {
        return  employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);

    }
}
