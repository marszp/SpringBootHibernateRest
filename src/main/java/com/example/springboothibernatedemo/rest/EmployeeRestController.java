package com.example.springboothibernatedemo.rest;

import com.example.springboothibernatedemo.dao.EmployeeDAO;
import com.example.springboothibernatedemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;
    // inject employee dao

    @Autowired
    public EmployeeRestController(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
        return employeeDAO.getAll();
    }

    // expose "/"
}
