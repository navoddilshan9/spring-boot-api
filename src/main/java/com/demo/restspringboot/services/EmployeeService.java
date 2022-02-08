package com.demo.restspringboot.services;

import com.demo.restspringboot.model.Employee;

public interface EmployeeService {

     Employee getEmployee(long id);
     Employee saveEmployee(Employee employee);

}

