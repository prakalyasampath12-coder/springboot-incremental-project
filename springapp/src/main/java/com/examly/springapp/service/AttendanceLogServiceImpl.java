package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.AttendanceLog;
import com.examly.springapp.repository.AttendanceLogRepository;

@Service
public class AttendanceLogServiceImpl implements AttendanceLogService {

    @Autowired
    private AttendanceLogRepository repository;

    @Override
    public AttendanceLog save(AttendanceLog log) {
        return repository.save(log);
    }

    @Override
    public AttendanceLog update(Long id, AttendanceLog log) {
        AttendanceLog existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setEmployeeCode(log.getEmployeeCode());
            existing.setDate(log.getDate());
            existing.setCheckOutTime(log.getCheckOutTime());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public List<AttendanceLog> findAll() {
        return repository.findAll();
    }
}
