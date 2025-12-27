package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.AdminUser;
import com.examly.springapp.service.AdminUserServiceImpl;
@RequestMapping
@RestController

public class AdminUserController {
    @Autowired
    AdminUserServiceImpl ser;

    @GetMapping("/admin/{id}")
    public AdminUser getusers(@PathVariable int id)
    {
        return ser.getbyid(id);
    }
    @PostMapping("admin/create")
    public AdminUser addUser(@RequestBody AdminUser a)
    {
        return ser.add(a);
    }
    @PutMapping("admin/{id}")
    public AdminUser update(@PathVariable int id,@RequestBody AdminUser a1)
    {
              return ser.update(id,a1);
    }
    @GetMapping("admin")
    public List<AdminUser> getall()
    {
        return ser.getall();
    }

    

    
}
