package com.examly.springapp.service;

import java.util.List;

import com.examly.springapp.model.AdminUser;

public interface  AdminUserService 
{
     public AdminUser add(AdminUser a);
     public AdminUser getbyid(int id);
     public AdminUser update(int id,AdminUser a);
     public List<AdminUser> getall();
}