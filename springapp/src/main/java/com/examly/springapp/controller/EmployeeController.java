package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Employee;
import com.examly.springapp.service.EmployeeService;
import com.examly.springapp.service.EmployeeServiceImpl;

import io.micrometer.observation.transport.ResponseContext;


@RestController
@RequestMapping
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl ser;

    @GetMapping("/users/{id}")
    public void getdetails(@PathVariable int id)
    {
        
    }
    @PostMapping("/employees")
    public Employee addemploy(@RequestBody Employee e)
    {
       

            return ser.add(e);
    }
    @GetMapping("/employees")
    public List<Employee> getall()
    {
        return ser.getall();
    }
    @GetMapping("/employees/{id}")
    public Employee getbyid(@PathVariable Long id)
    {
        return ser.getbyid(id);
    }
    @PutMapping("/employees/{id}")
    public Employee update(@PathVariable Long id,@RequestBody Employee e)
    {
        return ser.update(id,e);
    }
    @DeleteMapping("/employees/{id}")
    public String deletebyid(@PathVariable Long id)
    {
        return ser.deletebyid(id);
    }
    
}
