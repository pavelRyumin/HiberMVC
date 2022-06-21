package com.pavel.spring.mvc_aop_hibernate.dao;

import org.hibernate.Session;
import com.pavel.spring.mvc_aop_hibernate.entity.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.
                getCurrentSession();
        List<Employee> allEmployees = session.
                createQuery("from Employee",
                        Employee.class).
                getResultList();
        return allEmployees;
    }
}
