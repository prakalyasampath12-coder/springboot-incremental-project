package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Employee;
import com.examly.springapp.repository.EmployeeRepository;


public interface EmployeeService
{
    public Employee add(Employee e);
    public List<Employee>getall();
    public Employee getbyid(Long id);
    public Employee update(Long id,Employee e);
    public String deletebyid(Long id);
}