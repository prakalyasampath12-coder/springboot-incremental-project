package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.examly.springapp.model.DailyAttendanceSummary;
import com.examly.springapp.service.DailyAttendanceSummaryService;

@RestController
@RequestMapping("/daily-summary")
public class DailyAttendanceSummaryController {

    @Autowired
    private DailyAttendanceSummaryService service;
   
    @PostMapping("/create")
    public DailyAttendanceSummary create(
            @RequestBody DailyAttendanceSummary summary) {
        return service.create(summary);
    }
    @GetMapping("/employee/{employeeId}")
    public Page<DailyAttendanceSummary> getByEmployeeId(
            @PathVariable Long employeeId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);
        return service.getByEmployeeId(employeeId, pageable);
    }

    // @GetMapping("/employee/code/{employeeCode}")
    // public Page<DailyAttendanceSummary> getByEmployeeCode(
    //         @PathVariable String employeeCode,
    //         @RequestParam String startDate,
    //         @RequestParam String endDate,
    //         @RequestParam(defaultValue = "0") int page,
    //         @RequestParam(defaultValue = "5") int size) {

    //     Pageable pageable = PageRequest.of(page, size);
    //     return service.getByEmployeeCode(employeeCode, pageable);
    // }
    @GetMapping("/employee/code/{employeeCode}")
    public Page<DailyAttendanceSummary> getByEmployeeCodeAndDateRange(
            @PathVariable String employeeCode,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate endDate,
            @RequestParam int page,
            @RequestParam int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return service.getByEmployeeCodeAndDateRange(
                employeeCode, startDate, endDate, pageable);
    }
}








    

//     // REQUIRED for Day 9 & Day 11
   
// }
