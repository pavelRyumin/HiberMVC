package com.pavel.spring.mvc_aop_hibernate.dao;

import com.pavel.spring.mvc_aop_hibernate.entity.Employee;

import java.util.List;


public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
