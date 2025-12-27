package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Employee;
import com.examly.springapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
     @Autowired
    EmployeeRepository repo;
    @Override
    public Employee add(Employee e)
    {
        return repo.save(e);
    }
    @Override
    public List<Employee> getall() {
       return repo.findAll();
        
    }
    @Override
    public Employee getbyid(Long id)
    {
        return repo.findById(id).orElse(null);
    }
    @Override
    public Employee update(Long id,Employee e)
    {
        Employee s=repo.findById(id).orElse(null);
        s.setName(e.getName());
        s.setEmail(e.getEmail());
        s.setDepartment(e.getDepartment());
        s.setEmpCode(e.getEmpCode());
        return repo.save(s);



    }
    @Override
    public String deletebyid(Long id)
    {
        repo.deleteById(id);
        return "DELETED SUCCESSFULLY";
    }
}