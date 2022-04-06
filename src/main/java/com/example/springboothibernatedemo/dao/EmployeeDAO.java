package com.example.springboothibernatedemo.dao;

import com.example.springboothibernatedemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAll();
}
