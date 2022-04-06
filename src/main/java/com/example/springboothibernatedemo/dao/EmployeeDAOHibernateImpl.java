package com.example.springboothibernatedemo.dao;

import com.example.springboothibernatedemo.entity.Employee;
import org.hibernate.query.*;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO{

    private EntityManager entityManager;


    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }



    @Override
    @Transactional
    public List<Employee> getAll() {
        Session currentSesion = entityManager.unwrap(Session.class);

        Query<Employee> theQuery =
                currentSesion.createQuery("from Employee",Employee.class);

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

}
