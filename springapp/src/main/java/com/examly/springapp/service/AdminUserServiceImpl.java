package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.AdminUser;
import com.examly.springapp.repository.AdminUserRepository;

@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired 
    AdminUserRepository repo;
    @Override
    public AdminUser add(AdminUser a)
    {
       return repo.save(a);
    }
    @Override
    public AdminUser getbyid(int id)
    {
        return repo.findById(id).orElse(null);
    }
    @Override
    public AdminUser update(int id,AdminUser a)
    {
        AdminUser c=repo.findById(id).orElse(null);
        c.setPassword(a.getPassword());
        c.setUsername(a.getUsername());
        return repo.save(c);
    }
    @Override
    public List<AdminUser>getall()
    {
        return repo.findAll();
    }

    
}
