package com.pavel.spring.mvc_aop_hibernate.dao;

import com.pavel.spring.mvc_aop_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
