package com.examly.springapp.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity 
public class AttendanceLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    
    Long id ;
    
    String employeeCode;
    LocalDate date;
    LocalTime checkInTime;
    LocalTime checkOutTime;
    public AttendanceLog(String employeeCode, LocalDate date, LocalTime checkInTime, LocalTime checkOutTime) {
        this.employeeCode = employeeCode;
        this.date = date;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }
    public AttendanceLog() {
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
    public LocalTime getCheckInTime() {
        return checkInTime;
    }
    public void setCheckInTime(LocalTime checkInTime) {
        this.checkInTime = checkInTime;
    }
    public LocalTime getCheckOutTime() {
        return checkOutTime;
    }
    public void setCheckOutTime(LocalTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }
    

}
