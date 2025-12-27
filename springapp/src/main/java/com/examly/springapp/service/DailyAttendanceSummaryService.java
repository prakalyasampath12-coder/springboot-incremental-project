package com.examly.springapp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.examly.springapp.model.DailyAttendanceSummary;
import java.time.*;

public interface DailyAttendanceSummaryService {

    Page<DailyAttendanceSummary> getByEmployeeId(Long employeeId, Pageable pageable);

    Page<DailyAttendanceSummary> getByEmployeeCode(
        String employeeCode, Pageable pageable
    );
   
    DailyAttendanceSummary create(DailyAttendanceSummary summary);

    


    Page<DailyAttendanceSummary> getByEmployeeCodeAndDateRange(
            String employeeCode,
            LocalDate startDate,
            LocalDate endDate,
            Pageable pageable
    );
}


