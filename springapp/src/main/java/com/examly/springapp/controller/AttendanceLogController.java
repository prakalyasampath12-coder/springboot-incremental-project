// package com.examly.springapp.controller;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// @RequestMapping
// public class AttendanceLogController {
    
    
    
    
// }
package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.model.AttendanceLog;
import com.examly.springapp.service.AttendanceLogService;

@RestController
@RequestMapping("/attendancelogs")
public class AttendanceLogController {

    @Autowired
    private AttendanceLogService service;

    // POST /attendancelogs
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AttendanceLog addAttendance(@RequestBody AttendanceLog log) {
        return service.save(log);
    }

    // PUT /attendancelogs/{id}
    @PutMapping("/{id}")
    public AttendanceLog updateAttendance(
            @PathVariable Long id,
            @RequestBody AttendanceLog log) {
        return service.update(id, log);
    }

    // GET /attendancelogs
    @GetMapping
    public List<AttendanceLog> getAll() {
        return service.findAll();
    }
}


