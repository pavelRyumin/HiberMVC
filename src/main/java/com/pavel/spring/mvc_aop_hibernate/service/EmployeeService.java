package com.pavel.spring.mvc_aop_hibernate.service;

import com.pavel.spring.mvc_aop_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);
}
