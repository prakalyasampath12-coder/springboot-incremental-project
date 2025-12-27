// package com.examly.springapp.repository;

// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.Pageable;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// import com.examly.springapp.model.DailyAttendanceSummary;

// @Repository
// public interface DailyAttendanceSummaryRepository 
//         extends JpaRepository<DailyAttendanceSummary, Long> {

//     Page<DailyAttendanceSummary> findByEmployeeCode(
//         String employeeCode, Pageable pageable
//     );
// }
package com.examly.springapp.repository;

import com.examly.springapp.model.DailyAttendanceSummary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface DailyAttendanceSummaryRepository
        extends JpaRepository<DailyAttendanceSummary, Long> {

    @Query("""
        SELECT d FROM DailyAttendanceSummary d
        WHERE d.employeeCode = :empCode
        AND d.date BETWEEN :start AND :end
    """)
    Page<DailyAttendanceSummary> findByEmployeeCodeAndDateRange(
            String empCode,
            LocalDate start,
            LocalDate end,
            Pageable pageable
    );
}
