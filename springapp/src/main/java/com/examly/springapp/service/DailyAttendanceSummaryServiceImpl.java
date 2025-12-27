package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.DailyAttendanceSummary;
import com.examly.springapp.repository.DailyAttendanceSummaryRepository;

import java.util.Collections;
import java.time.*;
@Service
public class DailyAttendanceSummaryServiceImpl 
        implements DailyAttendanceSummaryService {
    @Autowired
    DailyAttendanceSummaryRepository repository;

    @Override
    public Page<DailyAttendanceSummary> getByEmployeeId(
            Long employeeId, Pageable pageable) {
        return new PageImpl<>(Collections.emptyList(), pageable, 0);
    }

    @Override
    public Page<DailyAttendanceSummary> getByEmployeeCode(
            String employeeCode, Pageable pageable) {
        return new PageImpl<>(Collections.emptyList(), pageable, 0);
    }
     @Override
    public DailyAttendanceSummary create(DailyAttendanceSummary summary) {
        return repository.save(summary);
    }
    

    @Override
    public Page<DailyAttendanceSummary> getByEmployeeCodeAndDateRange(
            String employeeCode,
            LocalDate startDate,
            LocalDate endDate,
            Pageable pageable
    ) {
        return repository.findByEmployeeCodeAndDateRange(
                employeeCode, startDate, endDate, pageable);
    }
}
    
    

     
    
