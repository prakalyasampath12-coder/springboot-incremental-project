// package com.examly.springapp.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;

// @Entity
// public class DailyAttendanceSummary {

//     @Id
//     private Long id;

//     private String employeeCode;

//     public DailyAttendanceSummary() {}

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getEmployeeCode() {
//         return employeeCode;
//     }

//     public void setEmployeeCode(String employeeCode) {
//         this.employeeCode = employeeCode;
//     }
// }
package com.examly.springapp.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class DailyAttendanceSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeCode;

    private LocalDate date;
    
    


    public DailyAttendanceSummary() {
    }

    public DailyAttendanceSummary(String employeeCode, LocalDate date) {
        this.employeeCode = employeeCode;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}

