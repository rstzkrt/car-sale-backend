package com.rstzkrt.carsalebackend.repository;

import com.rstzkrt.carsalebackend.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IReportRepository extends JpaRepository<Report,Long> {

    @Query(value = "select reports_report_id from app_user_reports where app_user_app_user_id=:userId",nativeQuery = true)
    List<Long> getAllReportIdsByUserId(@Param("userId") Long userId);

    List<Report> findReportByReportIdIn(List<Long> reportIds);
}
